package com.clubdb.model;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Evento {
    public Integer ID_Evento;
    public String Nome;
    public LocalDate Data;
    public BigDecimal Importo_Raccolto;
    public Integer ID_Stadio;

    public Evento() {}

    public Evento(Integer ID_Evento, String Nome, LocalDate Data, BigDecimal Importo_Raccolto, Integer ID_Stadio) {
        this.ID_Evento = ID_Evento;
        this.Nome = Nome;
        this.Data = Data;
        this.Importo_Raccolto = Importo_Raccolto;
        this.ID_Stadio = ID_Stadio;
    }
}
