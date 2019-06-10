package STORE;

public class Store {
    private Chips[] chips;
    private SodaPop[] sodapop;
    private Chocolate[] chocolate;

    public Store() {
    }

    public Chips[] getChips() {
        return chips;
    }

    public void setChips(Chips[] chips) {
        this.chips = chips;
    }

    public SodaPop[] getSodapop() {
        return sodapop;
    }

    public void setSodapop(SodaPop[] sodapop) {
        this.sodapop = sodapop;
    }

    public Chocolate[] getChocolate() {
        return chocolate;
    }

    public void setChocolate(Chocolate[] chocolate) {
        this.chocolate = chocolate;
    }
}


