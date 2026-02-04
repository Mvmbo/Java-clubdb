
package com.clubdb.view;

import com.clubdb.dao.CrudDao;
import com.clubdb.util.ColumnMeta;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GenericCrudPanel<T> extends JPanel {
    private final CrudDao<T> dao;
    private final Class<T> modelClass;
    private final List<ColumnMeta> columns;
    private final Map<String, JTextField> fields = new HashMap<>();
    private final DefaultTableModel tableModel;
    private final JTable table;
    private Map<String, Object> selectedKeys = new HashMap<>();

    public GenericCrudPanel(EntityDescriptor<T> descriptor) {
        this.dao = descriptor.dao();
        this.modelClass = descriptor.modelClass();
        this.columns = descriptor.columns();
        setLayout(new BorderLayout(10, 10));

        JPanel formPanel = buildFormPanel();
        add(formPanel, BorderLayout.NORTH);

        tableModel = new DefaultTableModel(columns.stream().map(ColumnMeta::name).toArray(), 0) {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        table = new JTable(tableModel);
        table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        table.getSelectionModel().addListSelectionListener(this::onRowSelected);

        JScrollPane scrollPane = new JScrollPane(table);
        add(scrollPane, BorderLayout.CENTER);

        JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        JButton createButton = new JButton("Create");
        JButton updateButton = new JButton("Update");
        JButton deleteButton = new JButton("Delete");
        JButton refreshButton = new JButton("Refresh");

        createButton.addActionListener(event -> handleCreate());
        updateButton.addActionListener(event -> handleUpdate());
        deleteButton.addActionListener(event -> handleDelete());
        refreshButton.addActionListener(event -> refresh());

        buttonPanel.add(createButton);
        buttonPanel.add(updateButton);
        buttonPanel.add(deleteButton);
        buttonPanel.add(refreshButton);
        add(buttonPanel, BorderLayout.SOUTH);

        refresh();
    }

    private JPanel buildFormPanel() {
        JPanel panel = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(4, 4, 4, 4);
        gbc.anchor = GridBagConstraints.WEST;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.weightx = 1.0;

        int row = 0;
        for (ColumnMeta column : columns) {
            gbc.gridy = row++;
            gbc.gridx = 0;
            panel.add(new JLabel(column.name()), gbc);
            gbc.gridx = 1;
            JTextField field = new JTextField(20);
            fields.put(column.name(), field);
            panel.add(field, gbc);
        }
        return panel;
    }

    private void onRowSelected(ListSelectionEvent event) {
        if (event.getValueIsAdjusting()) {
            return;
        }
        int row = table.getSelectedRow();
        if (row < 0) {
            return;
        }
        selectedKeys = new HashMap<>();
        for (int i = 0; i < columns.size(); i++) {
            ColumnMeta column = columns.get(i);
            Object value = tableModel.getValueAt(row, i);
            String displayValue = value == null ? "" : value.toString();
            fields.get(column.name()).setText(displayValue);
            if (column.primaryKey()) {
                Object parsed = column.type().parse(displayValue);
                selectedKeys.put(column.name(), parsed);
            }
        }
    }

    private void handleCreate() {
        try {
            T entity = buildEntityFromFields();
            dao.create(entity);
            refresh();
        } catch (Exception e) {
            showError(e);
        }
    }

    private void handleUpdate() {
        if (selectedKeys.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Select a row to update.", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        try {
            T entity = buildEntityFromFields();
            dao.update(entity, selectedKeys);
            refresh();
        } catch (Exception e) {
            showError(e);
        }
    }

    private void handleDelete() {
        if (selectedKeys.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Select a row to delete.", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        try {
            dao.delete(selectedKeys);
            refresh();
        } catch (Exception e) {
            showError(e);
        }
    }

    private void refresh() {
        try {
            List<T> data = dao.readAll();
            tableModel.setRowCount(0);
            for (T entity : data) {
                Object[] row = new Object[columns.size()];
                for (int i = 0; i < columns.size(); i++) {
                    ColumnMeta column = columns.get(i);
                    Object value = getFieldValue(entity, column.name());
                    row[i] = column.type().format(value);
                }
                tableModel.addRow(row);
            }
            selectedKeys = new HashMap<>();
        } catch (SQLException e) {
            showError(e);
        }
    }

    private T buildEntityFromFields() throws ReflectiveOperationException {
        T instance = modelClass.getDeclaredConstructor().newInstance();
        for (ColumnMeta column : columns) {
            JTextField field = fields.get(column.name());
            Object value = column.type().parse(field.getText());
            setFieldValue(instance, column.name(), value);
        }
        return instance;
    }

    private Object getFieldValue(T entity, String fieldName) {
        try {
            var field = modelClass.getDeclaredField(fieldName);
            field.setAccessible(true);
            return field.get(entity);
        } catch (ReflectiveOperationException e) {
            return null;
        }
    }

    private void setFieldValue(T entity, String fieldName, Object value) throws ReflectiveOperationException {
        var field = modelClass.getDeclaredField(fieldName);
        field.setAccessible(true);
        field.set(entity, value);
    }

    private void showError(Exception e) {
        String message = e instanceof SQLException ? e.getMessage() : e.toString();
        JOptionPane.showMessageDialog(this, message, "Error", JOptionPane.ERROR_MESSAGE);
    }
}
