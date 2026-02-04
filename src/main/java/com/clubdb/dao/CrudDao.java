
package com.clubdb.dao;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

public interface CrudDao<T> {
    void create(T entity) throws SQLException;

    List<T> readAll() throws SQLException;

    void update(T entity, Map<String, Object> originalKeys) throws SQLException;

    void delete(Map<String, Object> keys) throws SQLException;
}
