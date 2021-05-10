package at.itkollegimst.goegele.pos1makro.test2.druckerei.infrastructure.brokers.rabbitmq;


import org.springframework.cloud.stream.annotation.Input;
import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.SubscribableChannel;

public interface BuchBestelltBinding {

    String Bestellt = "buchBestellChannel";

    @Input(Bestellt)
    SubscribableChannel buchBestellung();

    @Output("buchGedrucktChannel")
    MessageChannel buchDrucken();
}
