package com.clubdb.dao;

import com.clubdb.model.Trasferimento;
import com.clubdb.util.ColumnMeta;
import com.clubdb.util.ColumnType;
import java.util.List;

public class TrasferimentoDao extends BaseDao<Trasferimento> {
    public TrasferimentoDao() {
        super(Trasferimento.class, "Trasferimento", List.of(
            new ColumnMeta("ID_Trasferimento", ColumnType.INT, true),
            new ColumnMeta("Tipo_Trasferimento", ColumnType.STRING, false),
            new ColumnMeta("Data_Trasferimento", ColumnType.DATE, false),
            new ColumnMeta("Importo", ColumnType.DECIMAL, false),
            new ColumnMeta("Modalita_Pagamento", ColumnType.STRING, false),
            new ColumnMeta("Percentuale_Rivendita", ColumnType.DECIMAL, false),
            new ColumnMeta("ID_Giocatore", ColumnType.INT, false)
        ));
    }
}
