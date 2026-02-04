package com.clubdb.model;

import java.math.BigDecimal;
import java.time.LocalDate;

public class TorneoExtraClub {
    public Integer ID_Torneo;
    public String Nome;
    public LocalDate Data_Inizio;
    public LocalDate Data_Fine;
    public String Luogo;

    public TorneoExtraClub() {}

    public TorneoExtraClub(Integer ID_Torneo, String Nome, LocalDate Data_Inizio, LocalDate Data_Fine, String Luogo) {
        this.ID_Torneo = ID_Torneo;
        this.Nome = Nome;
        this.Data_Inizio = Data_Inizio;
        this.Data_Fine = Data_Fine;
        this.Luogo = Luogo;
    }
}
