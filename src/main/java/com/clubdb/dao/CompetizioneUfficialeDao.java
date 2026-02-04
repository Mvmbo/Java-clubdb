package com.clubdb.dao;

import com.clubdb.model.CompetizioneUfficiale;
import com.clubdb.util.ColumnMeta;
import com.clubdb.util.ColumnType;
import java.util.List;

public class CompetizioneUfficialeDao extends BaseDao<CompetizioneUfficiale> {
    public CompetizioneUfficialeDao() {
        super(CompetizioneUfficiale.class, "CompetizioneUfficiale", List.of(
            new ColumnMeta("ID_Competizione", ColumnType.INT, true),
            new ColumnMeta("Nome", ColumnType.STRING, false),
            new ColumnMeta("Tipo", ColumnType.STRING, false),
            new ColumnMeta("Data_Inizio", ColumnType.DATE, false),
            new ColumnMeta("Data_Fine", ColumnType.DATE, false)
        ));
    }
}
