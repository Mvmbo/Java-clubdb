package com.clubdb.dao;

import com.clubdb.model.Stadio;
import com.clubdb.util.ColumnMeta;
import com.clubdb.util.ColumnType;
import java.util.List;

public class StadioDao extends BaseDao<Stadio> {
    public StadioDao() {
        super(Stadio.class, "Stadio", List.of(
            new ColumnMeta("ID_Stadio", ColumnType.INT, true),
            new ColumnMeta("Nome", ColumnType.STRING, false),
            new ColumnMeta("Via", ColumnType.STRING, false),
            new ColumnMeta("CAP", ColumnType.STRING, false),
            new ColumnMeta("Numero_Civico", ColumnType.STRING, false),
            new ColumnMeta("Capacita", ColumnType.INT, false),
            new ColumnMeta("Anno_Costruzione", ColumnType.INT, false),
            new ColumnMeta("Proprieta", ColumnType.STRING, false),
            new ColumnMeta("Numero_Settori", ColumnType.INT, false)
        ));
    }
}
