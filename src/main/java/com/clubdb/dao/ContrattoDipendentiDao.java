package com.clubdb.dao;

import com.clubdb.model.ContrattoDipendenti;
import com.clubdb.util.ColumnMeta;
import com.clubdb.util.ColumnType;
import java.util.List;

public class ContrattoDipendentiDao extends BaseDao<ContrattoDipendenti> {
    public ContrattoDipendentiDao() {
        super(ContrattoDipendenti.class, "ContrattoDipendenti", List.of(
            new ColumnMeta("ID_ContrattoDipendenti", ColumnType.INT, true),
            new ColumnMeta("Tipo_Contratto", ColumnType.STRING, false),
            new ColumnMeta("Stipendio", ColumnType.DECIMAL, false),
            new ColumnMeta("Opzioni_Rinnovo", ColumnType.STRING, false),
            new ColumnMeta("Data_Inizio", ColumnType.DATE, false),
            new ColumnMeta("Data_Fine", ColumnType.DATE, false),
            new ColumnMeta("Importo_Base", ColumnType.DECIMAL, false),
            new ColumnMeta("ID_Staff", ColumnType.INT, false),
            new ColumnMeta("ID_Giocatore", ColumnType.INT, false),
            new ColumnMeta("ID_Allenatore", ColumnType.INT, false)
        ));
    }
}
