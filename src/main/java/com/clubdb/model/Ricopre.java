package com.clubdb.model;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Ricopre {
    public Integer ID_Giocatore;
    public Integer ID_Ruolo;

    public Ricopre() {}

    public Ricopre(Integer ID_Giocatore, Integer ID_Ruolo) {
        this.ID_Giocatore = ID_Giocatore;
        this.ID_Ruolo = ID_Ruolo;
    }
}
