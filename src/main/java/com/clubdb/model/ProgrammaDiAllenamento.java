package com.clubdb.model;

import java.math.BigDecimal;
import java.time.LocalDate;

public class ProgrammaDiAllenamento {
    public Integer ID_Programma;
    public String Nome;
    public String Descrizione;
    public Integer ID_Settore;

    public ProgrammaDiAllenamento() {}

    public ProgrammaDiAllenamento(Integer ID_Programma, String Nome, String Descrizione, Integer ID_Settore) {
        this.ID_Programma = ID_Programma;
        this.Nome = Nome;
        this.Descrizione = Descrizione;
        this.ID_Settore = ID_Settore;
    }
}
