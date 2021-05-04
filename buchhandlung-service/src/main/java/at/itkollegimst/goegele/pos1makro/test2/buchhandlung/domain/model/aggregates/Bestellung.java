package at.itkollegimst.goegele.pos1makro.test2.buchhandlung.domain.model.aggregates;

import at.itkollegimst.goegele.pos1makro.test2.buchhandlung.domain.model.commands.BuchBestelltCommand;
import at.itkollegimst.goegele.pos1makro.test2.shareddomain.events.BuchBestelltEvent;
import at.itkollegimst.goegele.pos1makro.test2.buchhandlung.domain.model.valueobjects.Status;
import at.itkollegimst.goegele.pos1makro.test2.shareddomain.events.BuchBestelltEventData;
import org.springframework.data.domain.AbstractAggregateRoot;

import javax.persistence.*;

@Entity
@Table(name = "bestellung")
public class Bestellung extends AbstractAggregateRoot<Bestellung> {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="idbestellung")
    private int id;

    @Column(name="statusbestellung")
    @Enumerated(EnumType.STRING)
    private Status status;

    @Embedded
    private Bestellungid bestellid;

    public Bestellung() {
    }
    public Bestellung(BuchBestelltCommand command) {
        this.bestellid = new Bestellungid(command.getBestellid());
        addDomainEvent(new BuchBestelltEvent(new BuchBestelltEventData(bestellid.getBestellid())));
        this.status = command.getStatus();
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
