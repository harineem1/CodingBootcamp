public class IceCream {
    private String flavor;
    private boolean isDairyFree;
    private double pricePerOunce;

    public IceCream(String flavor, boolean isDairyFree, double pricePerOunce) {
        this.flavor = flavor;
        this.isDairyFree = isDairyFree;
        this.pricePerOunce = pricePerOunce;
    }

    public String getFlavor() {
        return flavor;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    public boolean isDairyFree() {
        return isDairyFree;
    }

    public void setDairyFree(boolean dairyFree) {
        isDairyFree = dairyFree;
    }

    public double getPricePerOunce() {
        return pricePerOunce;
    }

    public void setPricePerOunce(double pricePerOunce) {
        this.pricePerOunce = pricePerOunce;
    }
}
