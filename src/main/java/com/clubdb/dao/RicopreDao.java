package com.clubdb.dao;

import com.clubdb.model.Ricopre;
import com.clubdb.util.ColumnMeta;
import com.clubdb.util.ColumnType;
import java.util.List;

public class RicopreDao extends BaseDao<Ricopre> {
    public RicopreDao() {
        super(Ricopre.class, "Ricopre", List.of(
            new ColumnMeta("ID_Giocatore", ColumnType.INT, true),
            new ColumnMeta("ID_Ruolo", ColumnType.INT, true)
        ));
    }
}
