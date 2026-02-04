package com.clubdb.model;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Prodotto {
    public Integer ID_Prodotto;
    public String Tipo_Prodotto;
    public BigDecimal Prezzo;

    public Prodotto() {}

    public Prodotto(Integer ID_Prodotto, String Tipo_Prodotto, BigDecimal Prezzo) {
        this.ID_Prodotto = ID_Prodotto;
        this.Tipo_Prodotto = Tipo_Prodotto;
        this.Prezzo = Prezzo;
    }
}
