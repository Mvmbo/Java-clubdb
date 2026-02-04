package com.clubdb.model;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Possiede {
    public Integer ID_Allenatore;
    public Integer ID_Qualifica;

    public Possiede() {}

    public Possiede(Integer ID_Allenatore, Integer ID_Qualifica) {
        this.ID_Allenatore = ID_Allenatore;
        this.ID_Qualifica = ID_Qualifica;
    }
}
