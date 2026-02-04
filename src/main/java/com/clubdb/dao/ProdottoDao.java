package com.clubdb.dao;

import com.clubdb.model.Prodotto;
import com.clubdb.util.ColumnMeta;
import com.clubdb.util.ColumnType;
import java.util.List;

public class ProdottoDao extends BaseDao<Prodotto> {
    public ProdottoDao() {
        super(Prodotto.class, "Prodotto", List.of(
            new ColumnMeta("ID_Prodotto", ColumnType.INT, true),
            new ColumnMeta("Tipo_Prodotto", ColumnType.STRING, false),
            new ColumnMeta("Prezzo", ColumnType.DECIMAL, false)
        ));
    }
}
