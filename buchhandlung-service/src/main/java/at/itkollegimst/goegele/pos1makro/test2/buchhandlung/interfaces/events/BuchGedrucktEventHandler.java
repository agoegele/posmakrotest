package at.itkollegimst.goegele.pos1makro.test2.buchhandlung.interfaces.events;

import at.itkollegimst.goegele.pos1makro.test2.buchhandlung.application.internal.commandservices.BuchGedrucktCommandService;
import at.itkollegimst.goegele.pos1makro.test2.buchhandlung.infrastructure.brokers.rabbitmq.BuchBestelltEventSource;
import at.itkollegimst.goegele.pos1makro.test2.shareddomain.events.BuchBestelltEvent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.stereotype.Service;

@Service
@EnableBinding(BuchBestelltEventSource.class)
public class BuchGedrucktEventHandler {

    @Autowired
    private BuchGedrucktCommandService buchGedrucktCommandService;

    @StreamListener(target = BuchBestelltEventSource.Gedruckt)
    public void receiveEvent(BuchBestelltEvent buchBestelltEvent){
        buchGedrucktCommandService.buchWurdeGedruckt(buchBestelltEvent.getEventData().getBestellid());
    }
}
