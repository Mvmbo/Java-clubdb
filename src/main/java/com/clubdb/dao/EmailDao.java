package com.clubdb.dao;

import com.clubdb.model.Email;
import com.clubdb.util.ColumnMeta;
import com.clubdb.util.ColumnType;
import java.util.List;

public class EmailDao extends BaseDao<Email> {
    public EmailDao() {
        super(Email.class, "Email", List.of(
            new ColumnMeta("ID_Tifoso", ColumnType.INT, true),
            new ColumnMeta("IndirizzoEmail", ColumnType.STRING, true)
        ));
    }
}
