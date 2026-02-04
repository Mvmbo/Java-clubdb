package com.clubdb.dao;

import com.clubdb.model.TorneoExtraClub;
import com.clubdb.util.ColumnMeta;
import com.clubdb.util.ColumnType;
import java.util.List;

public class TorneoExtraClubDao extends BaseDao<TorneoExtraClub> {
    public TorneoExtraClubDao() {
        super(TorneoExtraClub.class, "TorneoExtraClub", List.of(
            new ColumnMeta("ID_Torneo", ColumnType.INT, true),
            new ColumnMeta("Nome", ColumnType.STRING, false),
            new ColumnMeta("Data_Inizio", ColumnType.DATE, false),
            new ColumnMeta("Data_Fine", ColumnType.DATE, false),
            new ColumnMeta("Luogo", ColumnType.STRING, false)
        ));
    }
}
