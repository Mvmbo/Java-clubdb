package com.clubdb.dao;

import com.clubdb.model.Possiede;
import com.clubdb.util.ColumnMeta;
import com.clubdb.util.ColumnType;
import java.util.List;

public class PossiedeDao extends BaseDao<Possiede> {
    public PossiedeDao() {
        super(Possiede.class, "Possiede", List.of(
            new ColumnMeta("ID_Allenatore", ColumnType.INT, true),
            new ColumnMeta("ID_Qualifica", ColumnType.INT, true)
        ));
    }
}
