package com.clubdb.dao;

import com.clubdb.model.Ingresso;
import com.clubdb.util.ColumnMeta;
import com.clubdb.util.ColumnType;
import java.util.List;

public class IngressoDao extends BaseDao<Ingresso> {
    public IngressoDao() {
        super(Ingresso.class, "Ingresso", List.of(
            new ColumnMeta("ID_Abbonamento", ColumnType.INT, true),
            new ColumnMeta("ID_Partita", ColumnType.INT, true)
        ));
    }
}
