package at.itkollegimst.goegele.pos1makro.test2.buchhandlung.domain.model.aggregates;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class Bestellungid implements Serializable {

    @Column(name="bestellid")
    private String bestellid;

    public Bestellungid(){
    }

    public Bestellungid(String bestellid){
        this.bestellid = bestellid;
    }

    public String getBestellid() {
        return bestellid;
    }

    public void setBestellid(String bestellid) {
        this.bestellid = bestellid;
    }
}
