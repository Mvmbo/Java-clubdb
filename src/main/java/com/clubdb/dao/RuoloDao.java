package com.clubdb.dao;

import com.clubdb.model.Ruolo;
import com.clubdb.util.ColumnMeta;
import com.clubdb.util.ColumnType;
import java.util.List;

public class RuoloDao extends BaseDao<Ruolo> {
    public RuoloDao() {
        super(Ruolo.class, "Ruolo", List.of(
            new ColumnMeta("ID_Ruolo", ColumnType.INT, true),
            new ColumnMeta("Posizione", ColumnType.STRING, false)
        ));
    }
}
