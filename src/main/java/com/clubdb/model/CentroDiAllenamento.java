package com.clubdb.model;

import java.math.BigDecimal;
import java.time.LocalDate;

public class CentroDiAllenamento {
    public Integer ID_CentroDiAllenamento;
    public String Nome;
    public String Via;
    public String CAP;
    public String Numero_Civico;
    public Integer Numero_Campi;
    public String Attrezzature;
    public String Orari_Apertura;

    public CentroDiAllenamento() {}

    public CentroDiAllenamento(Integer ID_CentroDiAllenamento, String Nome, String Via, String CAP, String Numero_Civico, Integer Numero_Campi, String Attrezzature, String Orari_Apertura) {
        this.ID_CentroDiAllenamento = ID_CentroDiAllenamento;
        this.Nome = Nome;
        this.Via = Via;
        this.CAP = CAP;
        this.Numero_Civico = Numero_Civico;
        this.Numero_Campi = Numero_Campi;
        this.Attrezzature = Attrezzature;
        this.Orari_Apertura = Orari_Apertura;
    }
}
