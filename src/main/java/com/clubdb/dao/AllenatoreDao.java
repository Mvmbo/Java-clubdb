package com.clubdb.dao;

import com.clubdb.model.Allenatore;
import com.clubdb.util.ColumnMeta;
import com.clubdb.util.ColumnType;
import java.util.List;

public class AllenatoreDao extends BaseDao<Allenatore> {
    public AllenatoreDao() {
        super(Allenatore.class, "Allenatore", List.of(
            new ColumnMeta("ID_Allenatore", ColumnType.INT, true),
            new ColumnMeta("Nome", ColumnType.STRING, false),
            new ColumnMeta("Data_Nascita", ColumnType.DATE, false)
        ));
    }
}
