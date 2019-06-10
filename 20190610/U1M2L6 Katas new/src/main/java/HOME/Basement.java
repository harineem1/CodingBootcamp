package HOME;

public class Basement {
    private Specifications specs;
    private boolean isInsulated;
    private boolean isFinished;

    public Basement() {
    }


    public Specifications getSpecs() {
        return specs;
    }

    public void setSpecs(Specifications specs) {
        this.specs = specs;
    }

    public boolean isInsulated() {
        return isInsulated;
    }

    public void setInsulated(boolean insulated) {
        isInsulated = insulated;
    }

    public boolean isFinished() {
        return isFinished;
    }

    public void setFinished(boolean finished) {
        isFinished = finished;
    }
}
