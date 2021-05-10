package at.itkollegimst.goegele.pos1makro.test2.druckerei.domain.model.aggregates;

import at.itkollegimst.goegele.pos1makro.test2.shareddomain.events.BuchGedrucktEvent;
import at.itkollegimst.goegele.pos1makro.test2.shareddomain.events.BuchGedrucktEventData;
import org.springframework.data.domain.AbstractAggregateRoot;

import javax.persistence.*;

@Entity
@Table(name = "bestellid")
public class Bestellid extends AbstractAggregateRoot<Bestellid> {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "bestellid")
    private String bestellid;

    public Bestellid(){
    }

    public Bestellid(String bestellid){
        this.bestellid = bestellid;
        addDomainEvent(new BuchGedrucktEvent(new BuchGedrucktEventData(bestellid)));
    }
    public void addDomainEvent(Object event){
        registerEvent(event);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBestellid() {
        return bestellid;
    }

    public void setBestellid(String bestellid) {
        this.bestellid = bestellid;
    }
}
