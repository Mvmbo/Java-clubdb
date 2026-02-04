package com.clubdb.model;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Premio {
    public Integer ID_Premio;
    public String Tipo;
    public String Nome;
    public LocalDate Data_Conferimento;
    public Integer ID_Competizione;
    public Integer ID_Torneo;

    public Premio() {}

    public Premio(Integer ID_Premio, String Tipo, String Nome, LocalDate Data_Conferimento, Integer ID_Competizione, Integer ID_Torneo) {
        this.ID_Premio = ID_Premio;
        this.Tipo = Tipo;
        this.Nome = Nome;
        this.Data_Conferimento = Data_Conferimento;
        this.ID_Competizione = ID_Competizione;
        this.ID_Torneo = ID_Torneo;
    }
}
