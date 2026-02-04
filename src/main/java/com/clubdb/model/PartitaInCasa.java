package com.clubdb.model;

import java.math.BigDecimal;
import java.time.LocalDate;

public class PartitaInCasa {
    public Integer ID_Partita;
    public Integer Affluenza_Pubblico;
    public Integer Num_Agenti_Sicurezza;
    public Integer ID_Stadio;

    public PartitaInCasa() {}

    public PartitaInCasa(Integer ID_Partita, Integer Affluenza_Pubblico, Integer Num_Agenti_Sicurezza, Integer ID_Stadio) {
        this.ID_Partita = ID_Partita;
        this.Affluenza_Pubblico = Affluenza_Pubblico;
        this.Num_Agenti_Sicurezza = Num_Agenti_Sicurezza;
        this.ID_Stadio = ID_Stadio;
    }
}
