package com.clubdb.model;

import java.math.BigDecimal;
import java.time.LocalDate;

public class SettoreGiovanile {
    public Integer ID_Settore;
    public String Nome;
    public String Fascia_Eta;

    public SettoreGiovanile() {}

    public SettoreGiovanile(Integer ID_Settore, String Nome, String Fascia_Eta) {
        this.ID_Settore = ID_Settore;
        this.Nome = Nome;
        this.Fascia_Eta = Fascia_Eta;
    }
}
