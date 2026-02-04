package com.clubdb.dao;

import com.clubdb.model.SettoreGiovanile;
import com.clubdb.util.ColumnMeta;
import com.clubdb.util.ColumnType;
import java.util.List;

public class SettoreGiovanileDao extends BaseDao<SettoreGiovanile> {
    public SettoreGiovanileDao() {
        super(SettoreGiovanile.class, "SettoreGiovanile", List.of(
            new ColumnMeta("ID_Settore", ColumnType.INT, true),
            new ColumnMeta("Nome", ColumnType.STRING, false),
            new ColumnMeta("Fascia_Eta", ColumnType.STRING, false)
        ));
    }
}
