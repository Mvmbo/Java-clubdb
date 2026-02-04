package com.clubdb.model;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Giocatore {
    public Integer ID_Giocatore;
    public String Nome;
    public LocalDate Data_Nascita;
    public String Nazionalita;

    public Giocatore() {}

    public Giocatore(Integer ID_Giocatore, String Nome, LocalDate Data_Nascita, String Nazionalita) {
        this.ID_Giocatore = ID_Giocatore;
        this.Nome = Nome;
        this.Data_Nascita = Data_Nascita;
        this.Nazionalita = Nazionalita;
    }
}
