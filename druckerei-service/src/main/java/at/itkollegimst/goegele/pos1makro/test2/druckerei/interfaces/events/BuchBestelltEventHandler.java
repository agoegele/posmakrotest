package at.itkollegimst.goegele.pos1makro.test2.druckerei.interfaces.events;

import at.itkollegimst.goegele.pos1makro.test2.druckerei.infrastructure.brokers.rabbitmq.BuchBestelltBinding;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.stereotype.Service;

@Service
@EnableBinding(BuchBestelltBinding.class)
public class BuchBestelltEventHandler {




}
