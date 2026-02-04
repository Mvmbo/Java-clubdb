package com.clubdb.dao;

import com.clubdb.model.Ordine;
import com.clubdb.util.ColumnMeta;
import com.clubdb.util.ColumnType;
import java.util.List;

public class OrdineDao extends BaseDao<Ordine> {
    public OrdineDao() {
        super(Ordine.class, "Ordine", List.of(
            new ColumnMeta("ID_Ordine", ColumnType.INT, true),
            new ColumnMeta("Data_Ordine", ColumnType.DATE, false),
            new ColumnMeta("Importo", ColumnType.DECIMAL, false),
            new ColumnMeta("Metodo_Pagamento", ColumnType.STRING, false),
            new ColumnMeta("Canale", ColumnType.STRING, false),
            new ColumnMeta("ID_Tifoso", ColumnType.INT, false)
        ));
    }
}
