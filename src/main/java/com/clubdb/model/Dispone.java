package com.clubdb.model;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Dispone {
    public Integer ID_Staff;
    public Integer ID_Specializzazione;

    public Dispone() {}

    public Dispone(Integer ID_Staff, Integer ID_Specializzazione) {
        this.ID_Staff = ID_Staff;
        this.ID_Specializzazione = ID_Specializzazione;
    }
}
