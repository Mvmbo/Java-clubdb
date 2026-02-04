package com.clubdb.dao;

import com.clubdb.model.Allenamento;
import com.clubdb.util.ColumnMeta;
import com.clubdb.util.ColumnType;
import java.util.List;

public class AllenamentoDao extends BaseDao<Allenamento> {
    public AllenamentoDao() {
        super(Allenamento.class, "Allenamento", List.of(
            new ColumnMeta("ID_CentroDiAllenamento", ColumnType.INT, true),
            new ColumnMeta("ID_Giocatore", ColumnType.INT, true)
        ));
    }
}
