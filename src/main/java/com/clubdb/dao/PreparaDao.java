package com.clubdb.dao;

import com.clubdb.model.Prepara;
import com.clubdb.util.ColumnMeta;
import com.clubdb.util.ColumnType;
import java.util.List;

public class PreparaDao extends BaseDao<Prepara> {
    public PreparaDao() {
        super(Prepara.class, "Prepara", List.of(
            new ColumnMeta("ID_Programma", ColumnType.INT, true),
            new ColumnMeta("ID_Staff", ColumnType.INT, true)
        ));
    }
}
