package HOME;

public class Bedroom {

    private Specifications specs;
    private Closets[] closet;

    public Bedroom() {
    }


    public Specifications getSpecs() {
        return specs;
    }

    public void setSpecs(Specifications specs) {
        this.specs = specs;
    }

    public Closets[] getCloset() {
        return closet;
    }

    public void setCloset(Closets[] closet) {
        this.closet = closet;
    }
}
