package com.clubdb.dao;

import com.clubdb.model.FinanziamentoEvento;
import com.clubdb.util.ColumnMeta;
import com.clubdb.util.ColumnType;
import java.util.List;

public class FinanziamentoEventoDao extends BaseDao<FinanziamentoEvento> {
    public FinanziamentoEventoDao() {
        super(FinanziamentoEvento.class, "FinanziamentoEvento", List.of(
            new ColumnMeta("ID_Evento", ColumnType.INT, true),
            new ColumnMeta("ID_Sponsor", ColumnType.INT, true)
        ));
    }
}
