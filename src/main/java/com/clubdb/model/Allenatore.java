package com.clubdb.model;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Allenatore {
    public Integer ID_Allenatore;
    public String Nome;
    public LocalDate Data_Nascita;

    public Allenatore() {}

    public Allenatore(Integer ID_Allenatore, String Nome, LocalDate Data_Nascita) {
        this.ID_Allenatore = ID_Allenatore;
        this.Nome = Nome;
        this.Data_Nascita = Data_Nascita;
    }
}
