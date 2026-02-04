package com.clubdb.model;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Sponsor {
    public Integer ID_Sponsor;
    public String Nome_Sponsor;
    public String Tipo;
    public String SettoreCompetenza;
    public String SedeLegale;

    public Sponsor() {}

    public Sponsor(Integer ID_Sponsor, String Nome_Sponsor, String Tipo, String SettoreCompetenza, String SedeLegale) {
        this.ID_Sponsor = ID_Sponsor;
        this.Nome_Sponsor = Nome_Sponsor;
        this.Tipo = Tipo;
        this.SettoreCompetenza = SettoreCompetenza;
        this.SedeLegale = SedeLegale;
    }
}
