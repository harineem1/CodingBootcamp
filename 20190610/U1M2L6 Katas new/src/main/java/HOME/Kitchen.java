package HOME;

public class Kitchen {

    private Specifications Specs;
    private boolean isIsland;
    private boolean isKitchenBar;
    private boolean isPantry;

    public Kitchen() {
    }


    public Specifications getSpecs() {
        return Specs;
    }

    public void setSpecs(Specifications specs) {
        Specs = specs;
    }

    public boolean isIsland() {
        return isIsland;
    }

    public void setIsland(boolean island) {
        isIsland = island;
    }

    public boolean isKitchenBar() {
        return isKitchenBar;
    }

    public void setKitchenBar(boolean kitchenBar) {
        isKitchenBar = kitchenBar;
    }

    public boolean isPantry() {
        return isPantry;
    }

    public void setPantry(boolean pantry) {
        isPantry = pantry;
    }
}
