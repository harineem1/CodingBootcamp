package HOME;

public class Home {
    private Kitchen k;
    private Basement bas;
    private Bedroom[] bed;
    private Bathroom[] bath;
    private Specifications specs;

    public Home() {
    }


    public Kitchen getK() {
        return k;
    }

    public void setK(Kitchen k) {
        this.k = k;
    }

    public Basement getBas() {
        return bas;
    }

    public void setBas(Basement bas) {
        this.bas = bas;
    }

    public Bedroom[] getBed() {
        return bed;
    }

    public void setBed(Bedroom[] bed) {
        this.bed = bed;
    }

    public Bathroom[] getBath() {
        return bath;
    }

    public void setBath(Bathroom[] bath) {
        this.bath = bath;
    }

    public Specifications getSpecs() {
        return specs;
    }

    public void setSpecs(Specifications specs) {
        this.specs = specs;
    }


    }

