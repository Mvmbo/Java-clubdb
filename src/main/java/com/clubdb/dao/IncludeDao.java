package com.clubdb.dao;

import com.clubdb.model.Include;
import com.clubdb.util.ColumnMeta;
import com.clubdb.util.ColumnType;
import java.util.List;

public class IncludeDao extends BaseDao<Include> {
    public IncludeDao() {
        super(Include.class, "Include", List.of(
            new ColumnMeta("ID_Ordine", ColumnType.INT, true),
            new ColumnMeta("ID_Prodotto", ColumnType.INT, true)
        ));
    }
}
