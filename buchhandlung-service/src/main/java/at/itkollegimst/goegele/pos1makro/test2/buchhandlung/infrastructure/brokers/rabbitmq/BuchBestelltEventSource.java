package at.itkollegimst.goegele.pos1makro.test2.buchhandlung.infrastructure.brokers.rabbitmq;

import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;


public interface BuchBestelltEventSource {

    @Output("buchBestellChannel")
    MessageChannel buchBestellung();

}
