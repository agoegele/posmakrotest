package at.itkollegimst.goegele.pos1makro.test2.buchhandlung.domain.model.commands;

import at.itkollegimst.goegele.pos1makro.test2.buchhandlung.domain.model.valueobjects.Status;

public class BuchBestelltCommand {

    Status status;

    public BuchBestelltCommand(){

    }

    public BuchBestelltCommand(Status status){
        this.status = status;
    }

    public Status getStatus() {
        return status;
    }
}
