package com.clubdb.model;

import java.math.BigDecimal;
import java.time.LocalDate;

public class ContrattoDipendenti {
    public Integer ID_ContrattoDipendenti;
    public String Tipo_Contratto;
    public BigDecimal Stipendio;
    public String Opzioni_Rinnovo;
    public LocalDate Data_Inizio;
    public LocalDate Data_Fine;
    public BigDecimal Importo_Base;
    public Integer ID_Staff;
    public Integer ID_Giocatore;
    public Integer ID_Allenatore;

    public ContrattoDipendenti() {}

    public ContrattoDipendenti(Integer ID_ContrattoDipendenti, String Tipo_Contratto, BigDecimal Stipendio, String Opzioni_Rinnovo, LocalDate Data_Inizio, LocalDate Data_Fine, BigDecimal Importo_Base, Integer ID_Staff, Integer ID_Giocatore, Integer ID_Allenatore) {
        this.ID_ContrattoDipendenti = ID_ContrattoDipendenti;
        this.Tipo_Contratto = Tipo_Contratto;
        this.Stipendio = Stipendio;
        this.Opzioni_Rinnovo = Opzioni_Rinnovo;
        this.Data_Inizio = Data_Inizio;
        this.Data_Fine = Data_Fine;
        this.Importo_Base = Importo_Base;
        this.ID_Staff = ID_Staff;
        this.ID_Giocatore = ID_Giocatore;
        this.ID_Allenatore = ID_Allenatore;
    }
}
