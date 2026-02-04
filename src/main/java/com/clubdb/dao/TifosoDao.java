package com.clubdb.dao;

import com.clubdb.model.Tifoso;
import com.clubdb.util.ColumnMeta;
import com.clubdb.util.ColumnType;
import java.util.List;

public class TifosoDao extends BaseDao<Tifoso> {
    public TifosoDao() {
        super(Tifoso.class, "Tifoso", List.of(
            new ColumnMeta("ID_Tifoso", ColumnType.INT, true),
            new ColumnMeta("Nome", ColumnType.STRING, false),
            new ColumnMeta("Cognome", ColumnType.STRING, false),
            new ColumnMeta("Citta", ColumnType.STRING, false),
            new ColumnMeta("Nazionalita", ColumnType.STRING, false)
        ));
    }
}
