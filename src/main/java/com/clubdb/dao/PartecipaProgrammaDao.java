package com.clubdb.dao;

import com.clubdb.model.PartecipaProgramma;
import com.clubdb.util.ColumnMeta;
import com.clubdb.util.ColumnType;
import java.util.List;

public class PartecipaProgrammaDao extends BaseDao<PartecipaProgramma> {
    public PartecipaProgrammaDao() {
        super(PartecipaProgramma.class, "PartecipaProgramma", List.of(
            new ColumnMeta("ID_Programma", ColumnType.INT, true),
            new ColumnMeta("ID_Giocatore", ColumnType.INT, true)
        ));
    }
}
