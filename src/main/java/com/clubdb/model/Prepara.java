package com.clubdb.model;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Prepara {
    public Integer ID_Programma;
    public Integer ID_Staff;

    public Prepara() {}

    public Prepara(Integer ID_Programma, Integer ID_Staff) {
        this.ID_Programma = ID_Programma;
        this.ID_Staff = ID_Staff;
    }
}
