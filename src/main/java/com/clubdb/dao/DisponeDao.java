package com.clubdb.dao;

import com.clubdb.model.Dispone;
import com.clubdb.util.ColumnMeta;
import com.clubdb.util.ColumnType;
import java.util.List;

public class DisponeDao extends BaseDao<Dispone> {
    public DisponeDao() {
        super(Dispone.class, "Dispone", List.of(
            new ColumnMeta("ID_Staff", ColumnType.INT, true),
            new ColumnMeta("ID_Specializzazione", ColumnType.INT, true)
        ));
    }
}
