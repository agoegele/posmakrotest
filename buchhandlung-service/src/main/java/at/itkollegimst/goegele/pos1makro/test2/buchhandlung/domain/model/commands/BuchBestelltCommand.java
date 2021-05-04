package at.itkollegimst.goegele.pos1makro.test2.buchhandlung.domain.model.commands;

import at.itkollegimst.goegele.pos1makro.test2.buchhandlung.domain.model.valueobjects.Status;

public class BuchBestelltCommand {

    private Status status;
    private String bestellid;

    public BuchBestelltCommand(){
        this.status=Status.Unbekannt;
    }

    public BuchBestelltCommand(Status status){
        this.status = status;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public String getBestellid() {
        return bestellid;
    }

    public void setBestellid(String bestellid) {
        this.bestellid = bestellid;
    }
}
