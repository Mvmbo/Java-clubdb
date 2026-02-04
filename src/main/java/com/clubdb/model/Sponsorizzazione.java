package com.clubdb.model;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Sponsorizzazione {
    public Integer ID_Sponsor;
    public Integer ID_Prodotto;

    public Sponsorizzazione() {}

    public Sponsorizzazione(Integer ID_Sponsor, Integer ID_Prodotto) {
        this.ID_Sponsor = ID_Sponsor;
        this.ID_Prodotto = ID_Prodotto;
    }
}
