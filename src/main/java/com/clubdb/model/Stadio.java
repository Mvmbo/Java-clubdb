package com.clubdb.model;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Stadio {
    public Integer ID_Stadio;
    public String Nome;
    public String Via;
    public String CAP;
    public String Numero_Civico;
    public Integer Capacita;
    public Integer Anno_Costruzione;
    public String Proprieta;
    public Integer Numero_Settori;

    public Stadio() {}

    public Stadio(Integer ID_Stadio, String Nome, String Via, String CAP, String Numero_Civico, Integer Capacita, Integer Anno_Costruzione, String Proprieta, Integer Numero_Settori) {
        this.ID_Stadio = ID_Stadio;
        this.Nome = Nome;
        this.Via = Via;
        this.CAP = CAP;
        this.Numero_Civico = Numero_Civico;
        this.Capacita = Capacita;
        this.Anno_Costruzione = Anno_Costruzione;
        this.Proprieta = Proprieta;
        this.Numero_Settori = Numero_Settori;
    }
}
