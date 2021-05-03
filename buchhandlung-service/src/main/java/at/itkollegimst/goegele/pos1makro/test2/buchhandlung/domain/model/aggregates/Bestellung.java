package at.itkollegimst.goegele.pos1makro.test2.buchhandlung.domain.model.aggregates;

import at.itkollegimst.goegele.pos1makro.test2.buchhandlung.domain.model.commands.BuchBestelltCommand;
import at.itkollegimst.goegele.pos1makro.test2.shareddomain.events.BuchBestelltEvent;
import at.itkollegimst.goegele.pos1makro.test2.buchhandlung.domain.model.valueobjects.Status;
import at.itkollegimst.goegele.pos1makro.test2.shareddomain.events.BuchBestelltEventData;
import org.springframework.data.domain.AbstractAggregateRoot;

import javax.persistence.*;

@Entity
public class Bestellung extends AbstractAggregateRoot<Bestellung> {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Embedded
    private Status status;

    public Bestellung() {
    }
    public Bestellung(BuchBestelltCommand command) {
        this.status = command.getStatus();
        addDomainEvent(new BuchBestelltEvent(new BuchBestelltEventData(this.id)));
        this.status = Status.Bestellt;
    }

    private void addDomainEvent(Object event) {
        registerEvent(event);
    }

    public long getId() {
        return id;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
}
