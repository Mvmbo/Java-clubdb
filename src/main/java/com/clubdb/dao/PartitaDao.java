package com.clubdb.dao;

import com.clubdb.model.Partita;
import com.clubdb.util.ColumnMeta;
import com.clubdb.util.ColumnType;
import java.util.List;

public class PartitaDao extends BaseDao<Partita> {
    public PartitaDao() {
        super(Partita.class, "Partita", List.of(
            new ColumnMeta("ID_Partita", ColumnType.INT, true),
            new ColumnMeta("Data", ColumnType.DATE, false),
            new ColumnMeta("Punteggio", ColumnType.STRING, false),
            new ColumnMeta("ID_Competizione", ColumnType.INT, false),
            new ColumnMeta("ID_Torneo", ColumnType.INT, false)
        ));
    }
}
