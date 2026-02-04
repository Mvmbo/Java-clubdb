package com.clubdb.dao;

import com.clubdb.model.Prestito;
import com.clubdb.util.ColumnMeta;
import com.clubdb.util.ColumnType;
import java.util.List;

public class PrestitoDao extends BaseDao<Prestito> {
    public PrestitoDao() {
        super(Prestito.class, "Prestito", List.of(
            new ColumnMeta("ID_Prestito", ColumnType.INT, true),
            new ColumnMeta("Tipo_Prestito", ColumnType.STRING, false),
            new ColumnMeta("Squadra_Coinvolta", ColumnType.STRING, false),
            new ColumnMeta("Data_Inizio", ColumnType.DATE, false),
            new ColumnMeta("Data_Fine", ColumnType.DATE, false),
            new ColumnMeta("Opzione_Acquisto", ColumnType.BOOLEAN, false),
            new ColumnMeta("Percentuale_Stipendio", ColumnType.DECIMAL, false),
            new ColumnMeta("ID_Giocatore", ColumnType.INT, false)
        ));
    }
}
