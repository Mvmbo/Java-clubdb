package com.clubdb.model;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Ruolo {
    public Integer ID_Ruolo;
    public String Posizione;

    public Ruolo() {}

    public Ruolo(Integer ID_Ruolo, String Posizione) {
        this.ID_Ruolo = ID_Ruolo;
        this.Posizione = Posizione;
    }
}
