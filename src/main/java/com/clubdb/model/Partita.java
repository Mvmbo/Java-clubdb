package com.clubdb.model;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Partita {
    public Integer ID_Partita;
    public LocalDate Data;
    public String Punteggio;
    public Integer ID_Competizione;
    public Integer ID_Torneo;

    public Partita() {}

    public Partita(Integer ID_Partita, LocalDate Data, String Punteggio, Integer ID_Competizione, Integer ID_Torneo) {
        this.ID_Partita = ID_Partita;
        this.Data = Data;
        this.Punteggio = Punteggio;
        this.ID_Competizione = ID_Competizione;
        this.ID_Torneo = ID_Torneo;
    }
}
