package com.clubdb.model;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Include {
    public Integer ID_Ordine;
    public Integer ID_Prodotto;

    public Include() {}

    public Include(Integer ID_Ordine, Integer ID_Prodotto) {
        this.ID_Ordine = ID_Ordine;
        this.ID_Prodotto = ID_Prodotto;
    }
}
