package at.itkollegimst.goegele.pos1makro.test2.shareddomain.events;

public class BuchBestelltEventData {

    private int id;
    private BuchBestelltEventData(){

    }

    public BuchBestelltEventData(int id){
        this.id=id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
