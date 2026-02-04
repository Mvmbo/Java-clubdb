package com.clubdb.model;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Trasferimento {
    public Integer ID_Trasferimento;
    public String Tipo_Trasferimento;
    public LocalDate Data_Trasferimento;
    public BigDecimal Importo;
    public String Modalita_Pagamento;
    public BigDecimal Percentuale_Rivendita;
    public Integer ID_Giocatore;

    public Trasferimento() {}

    public Trasferimento(Integer ID_Trasferimento, String Tipo_Trasferimento, LocalDate Data_Trasferimento, BigDecimal Importo, String Modalita_Pagamento, BigDecimal Percentuale_Rivendita, Integer ID_Giocatore) {
        this.ID_Trasferimento = ID_Trasferimento;
        this.Tipo_Trasferimento = Tipo_Trasferimento;
        this.Data_Trasferimento = Data_Trasferimento;
        this.Importo = Importo;
        this.Modalita_Pagamento = Modalita_Pagamento;
        this.Percentuale_Rivendita = Percentuale_Rivendita;
        this.ID_Giocatore = ID_Giocatore;
    }
}
