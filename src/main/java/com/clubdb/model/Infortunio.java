package com.clubdb.model;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Infortunio {
    public Integer ID_Giocatore;
    public LocalDate Data_Inizio;
    public String Tipo_Infortunio;
    public LocalDate Data_Fine;

    public Infortunio() {}

    public Infortunio(Integer ID_Giocatore, LocalDate Data_Inizio, String Tipo_Infortunio, LocalDate Data_Fine) {
        this.ID_Giocatore = ID_Giocatore;
        this.Data_Inizio = Data_Inizio;
        this.Tipo_Infortunio = Tipo_Infortunio;
        this.Data_Fine = Data_Fine;
    }
}
