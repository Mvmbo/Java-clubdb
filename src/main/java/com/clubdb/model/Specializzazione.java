package com.clubdb.model;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Specializzazione {
    public Integer ID_Specializzazione;
    public String Tipo;

    public Specializzazione() {}

    public Specializzazione(Integer ID_Specializzazione, String Tipo) {
        this.ID_Specializzazione = ID_Specializzazione;
        this.Tipo = Tipo;
    }
}
