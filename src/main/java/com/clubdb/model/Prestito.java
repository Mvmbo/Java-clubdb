package com.clubdb.model;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Prestito {
    public Integer ID_Prestito;
    public String Tipo_Prestito;
    public String Squadra_Coinvolta;
    public LocalDate Data_Inizio;
    public LocalDate Data_Fine;
    public Boolean Opzione_Acquisto;
    public BigDecimal Percentuale_Stipendio;
    public Integer ID_Giocatore;

    public Prestito() {}

    public Prestito(Integer ID_Prestito, String Tipo_Prestito, String Squadra_Coinvolta, LocalDate Data_Inizio, LocalDate Data_Fine, Boolean Opzione_Acquisto, BigDecimal Percentuale_Stipendio, Integer ID_Giocatore) {
        this.ID_Prestito = ID_Prestito;
        this.Tipo_Prestito = Tipo_Prestito;
        this.Squadra_Coinvolta = Squadra_Coinvolta;
        this.Data_Inizio = Data_Inizio;
        this.Data_Fine = Data_Fine;
        this.Opzione_Acquisto = Opzione_Acquisto;
        this.Percentuale_Stipendio = Percentuale_Stipendio;
        this.ID_Giocatore = ID_Giocatore;
    }
}
