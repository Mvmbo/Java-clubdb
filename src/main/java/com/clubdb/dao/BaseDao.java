
package com.clubdb.dao;

import com.clubdb.util.ColumnMeta;
import com.clubdb.util.ColumnType;
import com.clubdb.util.DBConnection;

import java.lang.reflect.Field;
import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class BaseDao<T> implements CrudDao<T> {
    private final Class<T> modelClass;
    private final String tableName;
    private final List<ColumnMeta> columns;
    private final List<ColumnMeta> primaryKeys;

    public BaseDao(Class<T> modelClass, String tableName, List<ColumnMeta> columns) {
        this.modelClass = modelClass;
        this.tableName = tableName;
        this.columns = List.copyOf(columns);
        this.primaryKeys = this.columns.stream().filter(ColumnMeta::primaryKey).toList();
    }

    @Override
    public void create(T entity) throws SQLException {
        String columnNames = columns.stream().map(ColumnMeta::name).collect(Collectors.joining(", "));
        String placeholders = columns.stream().map(c -> "?").collect(Collectors.joining(", "));
        String sql = "INSERT INTO " + tableName + " (" + columnNames + ") VALUES (" + placeholders + ")";
        try (Connection connection = DBConnection.getConnection();
             PreparedStatement statement = connection.prepareStatement(sql)) {
            int index = 1;
            for (ColumnMeta column : columns) {
                Object value = getFieldValue(entity, column.name());
                setStatementValue(statement, index++, column.type(), value);
            }
            statement.executeUpdate();
        }
    }

    @Override
    public List<T> readAll() throws SQLException {
        String columnNames = columns.stream().map(ColumnMeta::name).collect(Collectors.joining(", "));
        String sql = "SELECT " + columnNames + " FROM " + tableName;
        List<T> results = new ArrayList<>();
        try (Connection connection = DBConnection.getConnection();
             PreparedStatement statement = connection.prepareStatement(sql);
             ResultSet resultSet = statement.executeQuery()) {
            while (resultSet.next()) {
                T instance = modelClass.getDeclaredConstructor().newInstance();
                for (ColumnMeta column : columns) {
                    Object value = readResultSetValue(resultSet, column.name(), column.type());
                    setFieldValue(instance, column.name(), value);
                }
                results.add(instance);
            }
        } catch (ReflectiveOperationException e) {
            throw new SQLException("Unable to map result for " + tableName, e);
        }
        return results;
    }

    @Override
    public void update(T entity, Map<String, Object> originalKeys) throws SQLException {
        String setClause = columns.stream().map(c -> c.name() + " = ?").collect(Collectors.joining(", "));
        String whereClause = primaryKeys.stream().map(c -> c.name() + " = ?").collect(Collectors.joining(" AND "));
        String sql = "UPDATE " + tableName + " SET " + setClause + " WHERE " + whereClause;
        try (Connection connection = DBConnection.getConnection();
             PreparedStatement statement = connection.prepareStatement(sql)) {
            int index = 1;
            for (ColumnMeta column : columns) {
                Object value = getFieldValue(entity, column.name());
                setStatementValue(statement, index++, column.type(), value);
            }
            for (ColumnMeta key : primaryKeys) {
                Object value = originalKeys.get(key.name());
                setStatementValue(statement, index++, key.type(), value);
            }
            statement.executeUpdate();
        }
    }

    @Override
    public void delete(Map<String, Object> keys) throws SQLException {
        String whereClause = primaryKeys.stream().map(c -> c.name() + " = ?").collect(Collectors.joining(" AND "));
        String sql = "DELETE FROM " + tableName + " WHERE " + whereClause;
        try (Connection connection = DBConnection.getConnection();
             PreparedStatement statement = connection.prepareStatement(sql)) {
            int index = 1;
            for (ColumnMeta key : primaryKeys) {
                Object value = keys.get(key.name());
                setStatementValue(statement, index++, key.type(), value);
            }
            statement.executeUpdate();
        }
    }

    public List<ColumnMeta> getColumns() {
        return columns;
    }

    public List<ColumnMeta> getPrimaryKeys() {
        return primaryKeys;
    }

    private Object getFieldValue(T entity, String fieldName) throws SQLException {
        try {
            Field field = modelClass.getDeclaredField(fieldName);
            field.setAccessible(true);
            return field.get(entity);
        } catch (ReflectiveOperationException e) {
            throw new SQLException("Unable to read field " + fieldName + " from " + modelClass.getSimpleName(), e);
        }
    }

    private void setFieldValue(T entity, String fieldName, Object value) throws SQLException {
        try {
            Field field = modelClass.getDeclaredField(fieldName);
            field.setAccessible(true);
            field.set(entity, value);
        } catch (ReflectiveOperationException e) {
            throw new SQLException("Unable to set field " + fieldName + " on " + modelClass.getSimpleName(), e);
        }
    }

    private void setStatementValue(PreparedStatement statement, int index, ColumnType type, Object value) throws SQLException {
        if (value == null) {
            statement.setObject(index, null);
            return;
        }
        switch (type) {
            case DATE -> {
                if (value instanceof LocalDate date) {
                    statement.setDate(index, Date.valueOf(date));
                } else {
                    statement.setObject(index, value);
                }
            }
            case DECIMAL -> {
                if (value instanceof BigDecimal decimal) {
                    statement.setBigDecimal(index, decimal);
                } else {
                    statement.setObject(index, value);
                }
            }
            case BOOLEAN -> statement.setBoolean(index, (Boolean) value);
            case INT -> statement.setInt(index, (Integer) value);
            default -> statement.setObject(index, value);
        }
    }

    private Object readResultSetValue(ResultSet resultSet, String columnName, ColumnType type) throws SQLException {
        return switch (type) {
            case DATE -> {
                Date date = resultSet.getDate(columnName);
                yield date == null ? null : date.toLocalDate();
            }
            case DECIMAL -> resultSet.getBigDecimal(columnName);
            case BOOLEAN -> {
                boolean value = resultSet.getBoolean(columnName);
                yield resultSet.wasNull() ? null : value;
            }
            case INT -> {
                int value = resultSet.getInt(columnName);
                yield resultSet.wasNull() ? null : value;
            }
            case STRING -> resultSet.getString(columnName);
        };
    }
}
