package com.clubdb.dao;

import com.clubdb.model.Telefono;
import com.clubdb.util.ColumnMeta;
import com.clubdb.util.ColumnType;
import java.util.List;

public class TelefonoDao extends BaseDao<Telefono> {
    public TelefonoDao() {
        super(Telefono.class, "Telefono", List.of(
            new ColumnMeta("ID_Tifoso", ColumnType.INT, true),
            new ColumnMeta("Numero", ColumnType.STRING, true)
        ));
    }
}
