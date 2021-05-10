package at.itkollegimst.goegele.pos1makro.test2.shareddomain.events;

public class BuchGedrucktEventData {

    private String bestellid;

    private BuchGedrucktEventData(){
    }

    public BuchGedrucktEventData(String bestellid){
        this.bestellid=bestellid;
    }

    public String getBestellid() {
        return bestellid;
    }

    public void setBestellid(String bestellid) {
        this.bestellid = bestellid;
    }
}

