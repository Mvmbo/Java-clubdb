package com.clubdb.model;

import java.math.BigDecimal;
import java.time.LocalDate;

public class ContrattoSponsorizzazione {
    public Integer ID_ContrattoSponsorizzazioni;
    public String Tipo_Sponsorizzazione;
    public LocalDate Data_Inizio;
    public LocalDate Data_Fine;
    public BigDecimal Importo_Base;
    public Integer ID_Sponsor;

    public ContrattoSponsorizzazione() {}

    public ContrattoSponsorizzazione(Integer ID_ContrattoSponsorizzazioni, String Tipo_Sponsorizzazione, LocalDate Data_Inizio, LocalDate Data_Fine, BigDecimal Importo_Base, Integer ID_Sponsor) {
        this.ID_ContrattoSponsorizzazioni = ID_ContrattoSponsorizzazioni;
        this.Tipo_Sponsorizzazione = Tipo_Sponsorizzazione;
        this.Data_Inizio = Data_Inizio;
        this.Data_Fine = Data_Fine;
        this.Importo_Base = Importo_Base;
        this.ID_Sponsor = ID_Sponsor;
    }
}
