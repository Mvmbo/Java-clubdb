package com.clubdb.dao;

import com.clubdb.model.Biglietto;
import com.clubdb.util.ColumnMeta;
import com.clubdb.util.ColumnType;
import java.util.List;

public class BigliettoDao extends BaseDao<Biglietto> {
    public BigliettoDao() {
        super(Biglietto.class, "Biglietto", List.of(
            new ColumnMeta("ID_Biglietto", ColumnType.INT, true),
            new ColumnMeta("Posto", ColumnType.STRING, false),
            new ColumnMeta("Prezzo", ColumnType.DECIMAL, false),
            new ColumnMeta("Tipo_Biglietto", ColumnType.STRING, false),
            new ColumnMeta("ID_Partita", ColumnType.INT, false),
            new ColumnMeta("ID_Evento", ColumnType.INT, false),
            new ColumnMeta("ID_Ordine", ColumnType.INT, false)
        ));
    }
}
