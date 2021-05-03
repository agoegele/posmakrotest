package at.itkollegimst.goegele.pos1makro.test2.buchhandlung.domain.model.aggregates;

import at.itkollegimst.goegele.pos1makro.test2.buchhandlung.domain.model.valueobjects.Status;
import org.springframework.data.domain.AbstractAggregateRoot;

import javax.persistence.*;

@Entity
public class Bestellung extends AbstractAggregateRoot<Bestellung> {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Embedded
    private Status status;

    public Bestellung() {
        status = Status.Unbekannt;
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
