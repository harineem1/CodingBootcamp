package HOME;

public class Bathroom {

    private Specifications specs;
    private boolean isJacuzzi;
    private String showerType;

    public Bathroom() {
    }

    public Specifications getSpecs() {
        return specs;
    }

    public void setSpecs(Specifications specs) {
        this.specs = specs;
    }

    public boolean isJacuzzi() {
        return isJacuzzi;
    }

    public void setJacuzzi(boolean jacuzzi) {
        isJacuzzi = jacuzzi;
    }

    public String getShowerType() {
        return showerType;
    }

    public void setShowerType(String showerType) {
        this.showerType = showerType;
    }
}
