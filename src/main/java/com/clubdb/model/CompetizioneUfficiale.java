package com.clubdb.model;

import java.math.BigDecimal;
import java.time.LocalDate;

public class CompetizioneUfficiale {
    public Integer ID_Competizione;
    public String Nome;
    public String Tipo;
    public LocalDate Data_Inizio;
    public LocalDate Data_Fine;

    public CompetizioneUfficiale() {}

    public CompetizioneUfficiale(Integer ID_Competizione, String Nome, String Tipo, LocalDate Data_Inizio, LocalDate Data_Fine) {
        this.ID_Competizione = ID_Competizione;
        this.Nome = Nome;
        this.Tipo = Tipo;
        this.Data_Inizio = Data_Inizio;
        this.Data_Fine = Data_Fine;
    }
}
