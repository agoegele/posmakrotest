package at.itkollegimst.goegele.pos1makro.test2.druckerei.application.internal.commandservices;

import at.itkollegimst.goegele.pos1makro.test2.druckerei.domain.model.aggregates.Bestellid;
import at.itkollegimst.goegele.pos1makro.test2.druckerei.infrastructure.repositories.jpa.BestellidRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import javax.transaction.Transactional;

@Service
public class BuchDruckCommandService {

    @Autowired
    private BestellidRepository bestellidRepository;

    @Transactional
    public void druckeBuch(String bestellID){

        Bestellid bestellid = new Bestellid(bestellID);
        bestellidRepository.save(bestellid);

        System.out.println("Bestellung "+bestellid.getBestellid()+ " wird gedruckt");

    }
}
