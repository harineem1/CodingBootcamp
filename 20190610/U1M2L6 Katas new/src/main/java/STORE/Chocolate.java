package STORE;

public class Chocolate {
    private Boolean isMilk;
    private Double weight;
    private Double price;

    public Chocolate() {
    }

    public Boolean getMilk() {
        return isMilk;
    }

    public void setMilk(Boolean milk) {
        isMilk = milk;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}
