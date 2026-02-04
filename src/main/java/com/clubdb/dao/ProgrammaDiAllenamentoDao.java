package com.clubdb.dao;

import com.clubdb.model.ProgrammaDiAllenamento;
import com.clubdb.util.ColumnMeta;
import com.clubdb.util.ColumnType;
import java.util.List;

public class ProgrammaDiAllenamentoDao extends BaseDao<ProgrammaDiAllenamento> {
    public ProgrammaDiAllenamentoDao() {
        super(ProgrammaDiAllenamento.class, "ProgrammaDiAllenamento", List.of(
            new ColumnMeta("ID_Programma", ColumnType.INT, true),
            new ColumnMeta("Nome", ColumnType.STRING, false),
            new ColumnMeta("Descrizione", ColumnType.STRING, false),
            new ColumnMeta("ID_Settore", ColumnType.INT, false)
        ));
    }
}
