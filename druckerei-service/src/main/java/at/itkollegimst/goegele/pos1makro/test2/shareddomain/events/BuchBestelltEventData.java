package at.itkollegimst.goegele.pos1makro.test2.shareddomain.events;

public class BuchBestelltEventData {

    private String bestellid;

    private BuchBestelltEventData(){
    }

    public BuchBestelltEventData(String bestellid){
        this.bestellid=bestellid;
    }
    
    public String getBestellid() {
        return bestellid;
    }

    public void setBestellid(String bestellid) {
        this.bestellid = bestellid;
    }
}
