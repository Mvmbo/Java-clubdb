package com.clubdb.model;

import java.math.BigDecimal;
import java.time.LocalDate;

public class PartecipaEvento {
    public Integer ID_Tifoso;
    public Integer ID_Evento;

    public PartecipaEvento() {}

    public PartecipaEvento(Integer ID_Tifoso, Integer ID_Evento) {
        this.ID_Tifoso = ID_Tifoso;
        this.ID_Evento = ID_Evento;
    }
}
