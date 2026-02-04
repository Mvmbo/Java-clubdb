package com.clubdb.model;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Email {
    public Integer ID_Tifoso;
    public String IndirizzoEmail;

    public Email() {}

    public Email(Integer ID_Tifoso, String IndirizzoEmail) {
        this.ID_Tifoso = ID_Tifoso;
        this.IndirizzoEmail = IndirizzoEmail;
    }
}
