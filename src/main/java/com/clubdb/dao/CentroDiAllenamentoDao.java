package com.clubdb.dao;

import com.clubdb.model.CentroDiAllenamento;
import com.clubdb.util.ColumnMeta;
import com.clubdb.util.ColumnType;
import java.util.List;

public class CentroDiAllenamentoDao extends BaseDao<CentroDiAllenamento> {
    public CentroDiAllenamentoDao() {
        super(CentroDiAllenamento.class, "CentroDiAllenamento", List.of(
            new ColumnMeta("ID_CentroDiAllenamento", ColumnType.INT, true),
            new ColumnMeta("Nome", ColumnType.STRING, false),
            new ColumnMeta("Via", ColumnType.STRING, false),
            new ColumnMeta("CAP", ColumnType.STRING, false),
            new ColumnMeta("Numero_Civico", ColumnType.STRING, false),
            new ColumnMeta("Numero_Campi", ColumnType.INT, false),
            new ColumnMeta("Attrezzature", ColumnType.STRING, false),
            new ColumnMeta("Orari_Apertura", ColumnType.STRING, false)
        ));
    }
}
