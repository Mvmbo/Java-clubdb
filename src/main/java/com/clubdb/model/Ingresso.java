package com.clubdb.model;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Ingresso {
    public Integer ID_Abbonamento;
    public Integer ID_Partita;

    public Ingresso() {}

    public Ingresso(Integer ID_Abbonamento, Integer ID_Partita) {
        this.ID_Abbonamento = ID_Abbonamento;
        this.ID_Partita = ID_Partita;
    }
}
