package com.clubdb.model;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Telefono {
    public Integer ID_Tifoso;
    public String Numero;

    public Telefono() {}

    public Telefono(Integer ID_Tifoso, String Numero) {
        this.ID_Tifoso = ID_Tifoso;
        this.Numero = Numero;
    }
}
