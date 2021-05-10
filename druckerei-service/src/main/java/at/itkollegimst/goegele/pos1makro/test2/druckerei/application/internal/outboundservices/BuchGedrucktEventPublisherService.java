package at.itkollegimst.goegele.pos1makro.test2.druckerei.application.internal.outboundservices;


import at.itkollegimst.goegele.pos1makro.test2.druckerei.infrastructure.brokers.rabbitmq.BuchBestelltBinding;
import at.itkollegimst.goegele.pos1makro.test2.shareddomain.events.BuchBestelltEvent;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.event.TransactionalEventListener;

@Service
@EnableBinding(BuchBestelltBinding.class)
public class BuchGedrucktEventPublisherService {

    private BuchBestelltBinding eventSource;

    private BuchGedrucktEventPublisherService(BuchBestelltBinding eventSource) {
    this.eventSource = eventSource;
    }

    @TransactionalEventListener
    public void handleBuchBestelltEvent(BuchBestelltEvent event){
        eventSource.buchBestellung().send(MessageBuilder.withPayload(event).build());
    }

}

