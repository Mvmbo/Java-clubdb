package com.clubdb.dao;

import com.clubdb.model.Abbonamento;
import com.clubdb.util.ColumnMeta;
import com.clubdb.util.ColumnType;
import java.util.List;

public class AbbonamentoDao extends BaseDao<Abbonamento> {
    public AbbonamentoDao() {
        super(Abbonamento.class, "Abbonamento", List.of(
            new ColumnMeta("ID_Abbonamento", ColumnType.INT, true),
            new ColumnMeta("Tipo_Abbonamento", ColumnType.STRING, false),
            new ColumnMeta("Stagione", ColumnType.STRING, false),
            new ColumnMeta("Prezzo", ColumnType.DECIMAL, false),
            new ColumnMeta("Settore", ColumnType.STRING, false),
            new ColumnMeta("Data_Inizio", ColumnType.DATE, false),
            new ColumnMeta("Data_Fine", ColumnType.DATE, false),
            new ColumnMeta("Numero_Partite_Valide", ColumnType.INT, false),
            new ColumnMeta("ID_Ordine", ColumnType.INT, false)
        ));
    }
}
