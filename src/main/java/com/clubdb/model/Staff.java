package com.clubdb.model;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Staff {
    public Integer ID_Staff;
    public String Nome;
    public String Ruolo;

    public Staff() {}

    public Staff(Integer ID_Staff, String Nome, String Ruolo) {
        this.ID_Staff = ID_Staff;
        this.Nome = Nome;
        this.Ruolo = Ruolo;
    }
}
