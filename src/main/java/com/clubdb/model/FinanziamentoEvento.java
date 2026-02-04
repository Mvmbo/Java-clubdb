package com.clubdb.model;

import java.math.BigDecimal;
import java.time.LocalDate;

public class FinanziamentoEvento {
    public Integer ID_Evento;
    public Integer ID_Sponsor;

    public FinanziamentoEvento() {}

    public FinanziamentoEvento(Integer ID_Evento, Integer ID_Sponsor) {
        this.ID_Evento = ID_Evento;
        this.ID_Sponsor = ID_Sponsor;
    }
}
