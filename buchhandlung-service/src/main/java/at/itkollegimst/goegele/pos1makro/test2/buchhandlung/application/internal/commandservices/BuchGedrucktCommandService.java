package at.itkollegimst.goegele.pos1makro.test2.buchhandlung.application.internal.commandservices;

import at.itkollegimst.goegele.pos1makro.test2.buchhandlung.domain.model.valueobjects.Status;
import at.itkollegimst.goegele.pos1makro.test2.buchhandlung.infrastructure.repositories.jpa.BestellungRepository;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
public class BuchGedrucktCommandService {

    private BestellungRepository bestellungRepository;

    @Transactional
    public void buchWurdeGedruckt(String bestellid){
        bestellungRepository.updateStatus(Status.Abholbereit.toString(), bestellid);
    }

}
