package at.itkollegimst.goegele.pos1makro.test2.buchhandlung.application.internal.commandservices;

import at.itkollegimst.goegele.pos1makro.test2.buchhandlung.domain.model.aggregates.Bestellung;
import at.itkollegimst.goegele.pos1makro.test2.buchhandlung.domain.model.aggregates.Bestellungid;
import at.itkollegimst.goegele.pos1makro.test2.buchhandlung.domain.model.commands.BuchBestelltCommand;
import at.itkollegimst.goegele.pos1makro.test2.buchhandlung.domain.model.valueobjects.Status;
import at.itkollegimst.goegele.pos1makro.test2.buchhandlung.infrastructure.repositories.jpa.BestellungRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class BuchBestelltCommandService {

    @Autowired
    private BestellungRepository repository;

    public Bestellungid bestellen(BuchBestelltCommand command){

        String random = UUID.randomUUID().toString();
        command.setBestellid(random.substring(0, random.indexOf("-")));
        command.setStatus(Status.Bestellt);
        Bestellung bestellung = new Bestellung(command);
        repository.save(bestellung);
        return new Bestellungid(command.getBestellid());

    }
}
