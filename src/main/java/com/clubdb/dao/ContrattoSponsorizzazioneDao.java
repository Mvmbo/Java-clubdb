package com.clubdb.dao;

import com.clubdb.model.ContrattoSponsorizzazione;
import com.clubdb.util.ColumnMeta;
import com.clubdb.util.ColumnType;
import java.util.List;

public class ContrattoSponsorizzazioneDao extends BaseDao<ContrattoSponsorizzazione> {
    public ContrattoSponsorizzazioneDao() {
        super(ContrattoSponsorizzazione.class, "ContrattoSponsorizzazione", List.of(
            new ColumnMeta("ID_ContrattoSponsorizzazioni", ColumnType.INT, true),
            new ColumnMeta("Tipo_Sponsorizzazione", ColumnType.STRING, false),
            new ColumnMeta("Data_Inizio", ColumnType.DATE, false),
            new ColumnMeta("Data_Fine", ColumnType.DATE, false),
            new ColumnMeta("Importo_Base", ColumnType.DECIMAL, false),
            new ColumnMeta("ID_Sponsor", ColumnType.INT, false)
        ));
    }
}
