package com.clubdb.model;

import java.math.BigDecimal;
import java.time.LocalDate;

public class PartecipaProgramma {
    public Integer ID_Programma;
    public Integer ID_Giocatore;

    public PartecipaProgramma() {}

    public PartecipaProgramma(Integer ID_Programma, Integer ID_Giocatore) {
        this.ID_Programma = ID_Programma;
        this.ID_Giocatore = ID_Giocatore;
    }
}
