package com.clubdb.model;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Qualifica {
    public Integer ID_Qualifica;
    public String Nome;
    public String CategoriaSquadra;

    public Qualifica() {}

    public Qualifica(Integer ID_Qualifica, String Nome, String CategoriaSquadra) {
        this.ID_Qualifica = ID_Qualifica;
        this.Nome = Nome;
        this.CategoriaSquadra = CategoriaSquadra;
    }
}
