package com.clubdb.model;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Tifoso {
    public Integer ID_Tifoso;
    public String Nome;
    public String Cognome;
    public String Citta;
    public String Nazionalita;

    public Tifoso() {}

    public Tifoso(Integer ID_Tifoso, String Nome, String Cognome, String Citta, String Nazionalita) {
        this.ID_Tifoso = ID_Tifoso;
        this.Nome = Nome;
        this.Cognome = Cognome;
        this.Citta = Citta;
        this.Nazionalita = Nazionalita;
    }
}
