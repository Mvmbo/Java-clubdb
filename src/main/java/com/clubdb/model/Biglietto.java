package com.clubdb.model;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Biglietto {
    public Integer ID_Biglietto;
    public String Posto;
    public BigDecimal Prezzo;
    public String Tipo_Biglietto;
    public Integer ID_Partita;
    public Integer ID_Evento;
    public Integer ID_Ordine;

    public Biglietto() {}

    public Biglietto(Integer ID_Biglietto, String Posto, BigDecimal Prezzo, String Tipo_Biglietto, Integer ID_Partita, Integer ID_Evento, Integer ID_Ordine) {
        this.ID_Biglietto = ID_Biglietto;
        this.Posto = Posto;
        this.Prezzo = Prezzo;
        this.Tipo_Biglietto = Tipo_Biglietto;
        this.ID_Partita = ID_Partita;
        this.ID_Evento = ID_Evento;
        this.ID_Ordine = ID_Ordine;
    }
}
