package at.itkollegimst.goegele.pos1makro.test2.buchhandlung.infrastructure.brokers.rabbitmq;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.SubscribableChannel;

import javax.persistence.GeneratedValue;


public interface BuchBestelltEventSource {

    String Gedruckt = "buchGedrucktChannel";

    @Input(Gedruckt)
    SubscribableChannel buchGedruckt();


    @Output("buchBestellChannel")
    MessageChannel buchBestellung();

}
