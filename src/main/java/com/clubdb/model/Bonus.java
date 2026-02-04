package com.clubdb.model;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Bonus {
    public Integer ID_ContrattoDipendenti;
    public String Tipologia;
    public BigDecimal Importo;
    public String Condizione;

    public Bonus() {}

    public Bonus(Integer ID_ContrattoDipendenti, String Tipologia, BigDecimal Importo, String Condizione) {
        this.ID_ContrattoDipendenti = ID_ContrattoDipendenti;
        this.Tipologia = Tipologia;
        this.Importo = Importo;
        this.Condizione = Condizione;
    }
}
