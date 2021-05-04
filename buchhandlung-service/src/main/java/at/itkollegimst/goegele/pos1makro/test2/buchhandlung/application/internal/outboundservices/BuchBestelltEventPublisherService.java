package at.itkollegimst.goegele.pos1makro.test2.buchhandlung.application.internal.outboundservices;

import at.itkollegimst.goegele.pos1makro.test2.buchhandlung.infrastructure.brokers.rabbitmq.BuchBestelltEventSource;
import at.itkollegimst.goegele.pos1makro.test2.shareddomain.events.BuchBestelltEvent;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.event.TransactionalEventListener;

@Service
@EnableBinding(BuchBestelltEventSource.class)
public class BuchBestelltEventPublisherService {

    private BuchBestelltEventSource eventSource;

    public BuchBestelltEventPublisherService(BuchBestelltEventSource eventSource){
        this.eventSource = eventSource;
    }

    @TransactionalEventListener
    public void handleBuchBestelltEvent(BuchBestelltEvent event){
        eventSource.buchBestellung().send(MessageBuilder.withPayload(event).build());
    }


}
