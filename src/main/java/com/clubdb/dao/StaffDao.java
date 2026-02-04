package com.clubdb.dao;

import com.clubdb.model.Staff;
import com.clubdb.util.ColumnMeta;
import com.clubdb.util.ColumnType;
import java.util.List;

public class StaffDao extends BaseDao<Staff> {
    public StaffDao() {
        super(Staff.class, "Staff", List.of(
            new ColumnMeta("ID_Staff", ColumnType.INT, true),
            new ColumnMeta("Nome", ColumnType.STRING, false),
            new ColumnMeta("Ruolo", ColumnType.STRING, false)
        ));
    }
}
