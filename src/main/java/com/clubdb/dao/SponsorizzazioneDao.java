package com.clubdb.dao;

import com.clubdb.model.Sponsorizzazione;
import com.clubdb.util.ColumnMeta;
import com.clubdb.util.ColumnType;
import java.util.List;

public class SponsorizzazioneDao extends BaseDao<Sponsorizzazione> {
    public SponsorizzazioneDao() {
        super(Sponsorizzazione.class, "Sponsorizzazione", List.of(
            new ColumnMeta("ID_Sponsor", ColumnType.INT, true),
            new ColumnMeta("ID_Prodotto", ColumnType.INT, true)
        ));
    }
}
