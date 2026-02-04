package com.clubdb.dao;

import com.clubdb.model.PartitaInTrasferta;
import com.clubdb.util.ColumnMeta;
import com.clubdb.util.ColumnType;
import java.util.List;

public class PartitaInTrasfertaDao extends BaseDao<PartitaInTrasferta> {
    public PartitaInTrasfertaDao() {
        super(PartitaInTrasferta.class, "PartitaInTrasferta", List.of(
            new ColumnMeta("ID_Partita", ColumnType.INT, true),
            new ColumnMeta("Citta_Trasferta", ColumnType.STRING, false),
            new ColumnMeta("Tipo_Trasporto", ColumnType.STRING, false),
            new ColumnMeta("Alloggio", ColumnType.STRING, false)
        ));
    }
}
