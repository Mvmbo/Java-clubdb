package com.clubdb.model;

import java.math.BigDecimal;
import java.time.LocalDate;

public class PartitaInTrasferta {
    public Integer ID_Partita;
    public String Citta_Trasferta;
    public String Tipo_Trasporto;
    public String Alloggio;

    public PartitaInTrasferta() {}

    public PartitaInTrasferta(Integer ID_Partita, String Citta_Trasferta, String Tipo_Trasporto, String Alloggio) {
        this.ID_Partita = ID_Partita;
        this.Citta_Trasferta = Citta_Trasferta;
        this.Tipo_Trasporto = Tipo_Trasporto;
        this.Alloggio = Alloggio;
    }
}
