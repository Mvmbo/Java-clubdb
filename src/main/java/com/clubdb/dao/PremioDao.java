package com.clubdb.dao;

import com.clubdb.model.Premio;
import com.clubdb.util.ColumnMeta;
import com.clubdb.util.ColumnType;
import java.util.List;

public class PremioDao extends BaseDao<Premio> {
    public PremioDao() {
        super(Premio.class, "Premio", List.of(
            new ColumnMeta("ID_Premio", ColumnType.INT, true),
            new ColumnMeta("Tipo", ColumnType.STRING, false),
            new ColumnMeta("Nome", ColumnType.STRING, false),
            new ColumnMeta("Data_Conferimento", ColumnType.DATE, false),
            new ColumnMeta("ID_Competizione", ColumnType.INT, false),
            new ColumnMeta("ID_Torneo", ColumnType.INT, false)
        ));
    }
}
