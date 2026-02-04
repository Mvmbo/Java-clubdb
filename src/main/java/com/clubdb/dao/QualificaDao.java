package com.clubdb.dao;

import com.clubdb.model.Qualifica;
import com.clubdb.util.ColumnMeta;
import com.clubdb.util.ColumnType;
import java.util.List;

public class QualificaDao extends BaseDao<Qualifica> {
    public QualificaDao() {
        super(Qualifica.class, "Qualifica", List.of(
            new ColumnMeta("ID_Qualifica", ColumnType.INT, true),
            new ColumnMeta("Nome", ColumnType.STRING, false),
            new ColumnMeta("CategoriaSquadra", ColumnType.STRING, false)
        ));
    }
}
