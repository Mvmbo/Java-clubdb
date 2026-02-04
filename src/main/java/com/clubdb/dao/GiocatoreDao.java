package com.clubdb.dao;

import com.clubdb.model.Giocatore;
import com.clubdb.util.ColumnMeta;
import com.clubdb.util.ColumnType;
import java.util.List;

public class GiocatoreDao extends BaseDao<Giocatore> {
    public GiocatoreDao() {
        super(Giocatore.class, "Giocatore", List.of(
            new ColumnMeta("ID_Giocatore", ColumnType.INT, true),
            new ColumnMeta("Nome", ColumnType.STRING, false),
            new ColumnMeta("Data_Nascita", ColumnType.DATE, false),
            new ColumnMeta("Nazionalita", ColumnType.STRING, false)
        ));
    }
}
