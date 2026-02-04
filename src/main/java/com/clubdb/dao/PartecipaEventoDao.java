package com.clubdb.dao;

import com.clubdb.model.PartecipaEvento;
import com.clubdb.util.ColumnMeta;
import com.clubdb.util.ColumnType;
import java.util.List;

public class PartecipaEventoDao extends BaseDao<PartecipaEvento> {
    public PartecipaEventoDao() {
        super(PartecipaEvento.class, "PartecipaEvento", List.of(
            new ColumnMeta("ID_Tifoso", ColumnType.INT, true),
            new ColumnMeta("ID_Evento", ColumnType.INT, true)
        ));
    }
}
