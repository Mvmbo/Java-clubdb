package com.clubdb.model;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Allenamento {
    public Integer ID_CentroDiAllenamento;
    public Integer ID_Giocatore;

    public Allenamento() {}

    public Allenamento(Integer ID_CentroDiAllenamento, Integer ID_Giocatore) {
        this.ID_CentroDiAllenamento = ID_CentroDiAllenamento;
        this.ID_Giocatore = ID_Giocatore;
    }
}
