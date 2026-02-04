package com.clubdb.dao;

import com.clubdb.model.Infortunio;
import com.clubdb.util.ColumnMeta;
import com.clubdb.util.ColumnType;
import java.util.List;

public class InfortunioDao extends BaseDao<Infortunio> {
    public InfortunioDao() {
        super(Infortunio.class, "Infortunio", List.of(
            new ColumnMeta("ID_Giocatore", ColumnType.INT, true),
            new ColumnMeta("Data_Inizio", ColumnType.DATE, true),
            new ColumnMeta("Tipo_Infortunio", ColumnType.STRING, false),
            new ColumnMeta("Data_Fine", ColumnType.DATE, false)
        ));
    }
}
