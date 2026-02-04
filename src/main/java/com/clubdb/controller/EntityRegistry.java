package com.clubdb.controller;

import com.clubdb.dao.*;
import com.clubdb.model.*;
import com.clubdb.view.EntityDescriptor;
import java.util.List;

public class EntityRegistry {
    public static List<EntityDescriptor<?>> buildDescriptors() {
        return List.of(
            new EntityDescriptor<>("Giocatore", new GiocatoreDao(), Giocatore.class, new GiocatoreDao().getColumns()),
            new EntityDescriptor<>("Allenatore", new AllenatoreDao(), Allenatore.class, new AllenatoreDao().getColumns()),
            new EntityDescriptor<>("Staff", new StaffDao(), Staff.class, new StaffDao().getColumns()),
            new EntityDescriptor<>("Ruolo", new RuoloDao(), Ruolo.class, new RuoloDao().getColumns()),
            new EntityDescriptor<>("Qualifica", new QualificaDao(), Qualifica.class, new QualificaDao().getColumns()),
            new EntityDescriptor<>("Specializzazione", new SpecializzazioneDao(), Specializzazione.class, new SpecializzazioneDao().getColumns()),
            new EntityDescriptor<>("Prodotto", new ProdottoDao(), Prodotto.class, new ProdottoDao().getColumns()),
            new EntityDescriptor<>("Prestito", new PrestitoDao(), Prestito.class, new PrestitoDao().getColumns()),
            new EntityDescriptor<>("Trasferimento", new TrasferimentoDao(), Trasferimento.class, new TrasferimentoDao().getColumns()),
            new EntityDescriptor<>("ContrattoDipendenti", new ContrattoDipendentiDao(), ContrattoDipendenti.class, new ContrattoDipendentiDao().getColumns()),
            new EntityDescriptor<>("Sponsor", new SponsorDao(), Sponsor.class, new SponsorDao().getColumns()),
            new EntityDescriptor<>("ContrattoSponsorizzazione", new ContrattoSponsorizzazioneDao(), ContrattoSponsorizzazione.class, new ContrattoSponsorizzazioneDao().getColumns()),
            new EntityDescriptor<>("Stadio", new StadioDao(), Stadio.class, new StadioDao().getColumns()),
            new EntityDescriptor<>("CentroDiAllenamento", new CentroDiAllenamentoDao(), CentroDiAllenamento.class, new CentroDiAllenamentoDao().getColumns()),
            new EntityDescriptor<>("Evento", new EventoDao(), Evento.class, new EventoDao().getColumns()),
            new EntityDescriptor<>("CompetizioneUfficiale", new CompetizioneUfficialeDao(), CompetizioneUfficiale.class, new CompetizioneUfficialeDao().getColumns()),
            new EntityDescriptor<>("TorneoExtraClub", new TorneoExtraClubDao(), TorneoExtraClub.class, new TorneoExtraClubDao().getColumns()),
            new EntityDescriptor<>("Partita", new PartitaDao(), Partita.class, new PartitaDao().getColumns()),
            new EntityDescriptor<>("Tifoso", new TifosoDao(), Tifoso.class, new TifosoDao().getColumns()),
            new EntityDescriptor<>("Ordine", new OrdineDao(), Ordine.class, new OrdineDao().getColumns()),
            new EntityDescriptor<>("Biglietto", new BigliettoDao(), Biglietto.class, new BigliettoDao().getColumns()),
            new EntityDescriptor<>("Abbonamento", new AbbonamentoDao(), Abbonamento.class, new AbbonamentoDao().getColumns()),
            new EntityDescriptor<>("SettoreGiovanile", new SettoreGiovanileDao(), SettoreGiovanile.class, new SettoreGiovanileDao().getColumns()),
            new EntityDescriptor<>("ProgrammaDiAllenamento", new ProgrammaDiAllenamentoDao(), ProgrammaDiAllenamento.class, new ProgrammaDiAllenamentoDao().getColumns()),
            new EntityDescriptor<>("Premio", new PremioDao(), Premio.class, new PremioDao().getColumns()),
            new EntityDescriptor<>("Infortunio", new InfortunioDao(), Infortunio.class, new InfortunioDao().getColumns()),
            new EntityDescriptor<>("Bonus", new BonusDao(), Bonus.class, new BonusDao().getColumns()),
            new EntityDescriptor<>("PartitaInCasa", new PartitaInCasaDao(), PartitaInCasa.class, new PartitaInCasaDao().getColumns()),
            new EntityDescriptor<>("PartitaInTrasferta", new PartitaInTrasfertaDao(), PartitaInTrasferta.class, new PartitaInTrasfertaDao().getColumns()),
            new EntityDescriptor<>("Telefono", new TelefonoDao(), Telefono.class, new TelefonoDao().getColumns()),
            new EntityDescriptor<>("Email", new EmailDao(), Email.class, new EmailDao().getColumns()),
            new EntityDescriptor<>("Ricopre", new RicopreDao(), Ricopre.class, new RicopreDao().getColumns()),
            new EntityDescriptor<>("Possiede", new PossiedeDao(), Possiede.class, new PossiedeDao().getColumns()),
            new EntityDescriptor<>("Dispone", new DisponeDao(), Dispone.class, new DisponeDao().getColumns()),
            new EntityDescriptor<>("Allenamento", new AllenamentoDao(), Allenamento.class, new AllenamentoDao().getColumns()),
            new EntityDescriptor<>("FinanziamentoEvento", new FinanziamentoEventoDao(), FinanziamentoEvento.class, new FinanziamentoEventoDao().getColumns()),
            new EntityDescriptor<>("Include", new IncludeDao(), Include.class, new IncludeDao().getColumns()),
            new EntityDescriptor<>("Sponsorizzazione", new SponsorizzazioneDao(), Sponsorizzazione.class, new SponsorizzazioneDao().getColumns()),
            new EntityDescriptor<>("PartecipaEvento", new PartecipaEventoDao(), PartecipaEvento.class, new PartecipaEventoDao().getColumns()),
            new EntityDescriptor<>("PartecipaProgramma", new PartecipaProgrammaDao(), PartecipaProgramma.class, new PartecipaProgrammaDao().getColumns()),
            new EntityDescriptor<>("Prepara", new PreparaDao(), Prepara.class, new PreparaDao().getColumns()),
            new EntityDescriptor<>("Ingresso", new IngressoDao(), Ingresso.class, new IngressoDao().getColumns())
        );
    }
}
