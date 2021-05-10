package at.itkollegimst.goegele.pos1makro.test2.druckerei.interfaces.events;

import at.itkollegimst.goegele.pos1makro.test2.druckerei.application.internal.commandservices.BuchDruckCommandService;
import at.itkollegimst.goegele.pos1makro.test2.druckerei.infrastructure.brokers.rabbitmq.BuchBestelltBinding;
import at.itkollegimst.goegele.pos1makro.test2.shareddomain.events.BuchBestelltEvent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.stereotype.Service;

@Service
@EnableBinding(BuchBestelltBinding.class)
public class BuchBestelltEventHandler {

    @Autowired
    private BuchDruckCommandService buchDruckCommandService;

    @StreamListener(target = BuchBestelltBinding.Bestellt)
    public void receiveEvent(BuchBestelltEvent buchBestelltEvent){
        buchDruckCommandService.druckeBuch(buchBestelltEvent.getEventData().getBestellid());

    }


}
