package com.clubdb.model;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Abbonamento {
    public Integer ID_Abbonamento;
    public String Tipo_Abbonamento;
    public String Stagione;
    public BigDecimal Prezzo;
    public String Settore;
    public LocalDate Data_Inizio;
    public LocalDate Data_Fine;
    public Integer Numero_Partite_Valide;
    public Integer ID_Ordine;

    public Abbonamento() {}

    public Abbonamento(Integer ID_Abbonamento, String Tipo_Abbonamento, String Stagione, BigDecimal Prezzo, String Settore, LocalDate Data_Inizio, LocalDate Data_Fine, Integer Numero_Partite_Valide, Integer ID_Ordine) {
        this.ID_Abbonamento = ID_Abbonamento;
        this.Tipo_Abbonamento = Tipo_Abbonamento;
        this.Stagione = Stagione;
        this.Prezzo = Prezzo;
        this.Settore = Settore;
        this.Data_Inizio = Data_Inizio;
        this.Data_Fine = Data_Fine;
        this.Numero_Partite_Valide = Numero_Partite_Valide;
        this.ID_Ordine = ID_Ordine;
    }
}
