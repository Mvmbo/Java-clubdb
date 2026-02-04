package com.clubdb.dao;

import com.clubdb.model.Evento;
import com.clubdb.util.ColumnMeta;
import com.clubdb.util.ColumnType;
import java.util.List;

public class EventoDao extends BaseDao<Evento> {
    public EventoDao() {
        super(Evento.class, "Evento", List.of(
            new ColumnMeta("ID_Evento", ColumnType.INT, true),
            new ColumnMeta("Nome", ColumnType.STRING, false),
            new ColumnMeta("Data", ColumnType.DATE, false),
            new ColumnMeta("Importo_Raccolto", ColumnType.DECIMAL, false),
            new ColumnMeta("ID_Stadio", ColumnType.INT, false)
        ));
    }
}
