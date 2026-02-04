package com.clubdb.dao;

import com.clubdb.model.PartitaInCasa;
import com.clubdb.util.ColumnMeta;
import com.clubdb.util.ColumnType;
import java.util.List;

public class PartitaInCasaDao extends BaseDao<PartitaInCasa> {
    public PartitaInCasaDao() {
        super(PartitaInCasa.class, "PartitaInCasa", List.of(
            new ColumnMeta("ID_Partita", ColumnType.INT, true),
            new ColumnMeta("Affluenza_Pubblico", ColumnType.INT, false),
            new ColumnMeta("Num_Agenti_Sicurezza", ColumnType.INT, false),
            new ColumnMeta("ID_Stadio", ColumnType.INT, false)
        ));
    }
}
