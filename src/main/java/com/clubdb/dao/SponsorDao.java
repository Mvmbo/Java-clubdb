package com.clubdb.dao;

import com.clubdb.model.Sponsor;
import com.clubdb.util.ColumnMeta;
import com.clubdb.util.ColumnType;
import java.util.List;

public class SponsorDao extends BaseDao<Sponsor> {
    public SponsorDao() {
        super(Sponsor.class, "Sponsor", List.of(
            new ColumnMeta("ID_Sponsor", ColumnType.INT, true),
            new ColumnMeta("Nome_Sponsor", ColumnType.STRING, false),
            new ColumnMeta("Tipo", ColumnType.STRING, false),
            new ColumnMeta("SettoreCompetenza", ColumnType.STRING, false),
            new ColumnMeta("SedeLegale", ColumnType.STRING, false)
        ));
    }
}
