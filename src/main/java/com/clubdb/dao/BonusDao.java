package com.clubdb.dao;

import com.clubdb.model.Bonus;
import com.clubdb.util.ColumnMeta;
import com.clubdb.util.ColumnType;
import java.util.List;

public class BonusDao extends BaseDao<Bonus> {
    public BonusDao() {
        super(Bonus.class, "Bonus", List.of(
            new ColumnMeta("ID_ContrattoDipendenti", ColumnType.INT, true),
            new ColumnMeta("Tipologia", ColumnType.STRING, true),
            new ColumnMeta("Importo", ColumnType.DECIMAL, false),
            new ColumnMeta("Condizione", ColumnType.STRING, false)
        ));
    }
}
