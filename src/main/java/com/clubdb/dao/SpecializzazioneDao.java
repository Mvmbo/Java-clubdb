package com.clubdb.dao;

import com.clubdb.model.Specializzazione;
import com.clubdb.util.ColumnMeta;
import com.clubdb.util.ColumnType;
import java.util.List;

public class SpecializzazioneDao extends BaseDao<Specializzazione> {
    public SpecializzazioneDao() {
        super(Specializzazione.class, "Specializzazione", List.of(
            new ColumnMeta("ID_Specializzazione", ColumnType.INT, true),
            new ColumnMeta("Tipo", ColumnType.STRING, false)
        ));
    }
}
