package com.clubdb.model;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Ordine {
    public Integer ID_Ordine;
    public LocalDate Data_Ordine;
    public BigDecimal Importo;
    public String Metodo_Pagamento;
    public String Canale;
    public Integer ID_Tifoso;

    public Ordine() {}

    public Ordine(Integer ID_Ordine, LocalDate Data_Ordine, BigDecimal Importo, String Metodo_Pagamento, String Canale, Integer ID_Tifoso) {
        this.ID_Ordine = ID_Ordine;
        this.Data_Ordine = Data_Ordine;
        this.Importo = Importo;
        this.Metodo_Pagamento = Metodo_Pagamento;
        this.Canale = Canale;
        this.ID_Tifoso = ID_Tifoso;
    }
}
