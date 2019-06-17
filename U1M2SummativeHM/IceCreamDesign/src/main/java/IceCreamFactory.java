public class IceCreamFactory {

    private IceCream iceCream;
    private int milk;
    private int sugar;
    private String fruits;
    private int essence;
    private boolean isMachineOn;
    private boolean isRefrigeratorOn;
    private String[] employee;
    private double totalSales = 0;
    private String Manager;
    private String name;

    public IceCream getIceCream() {
        return iceCream;
    }

    public IceCreamFactory(String name) {
    this.name = name;
    }

    public void setIceCream(IceCream iceCream) {
        this.iceCream = iceCream;
    }

    public int getMilk() {
        return milk;
    }

    public void setMilk(int milk) {
        this.milk = milk;
    }

    public int getSugar() {
        return sugar;
    }

    public void setSugar(int sugar) {
        this.sugar = sugar;
    }

    public String getFruits() {
        return fruits;
    }

    public void setFruits(String fruits) {
        this.fruits = fruits;
    }

    public int getEssence() {
        return essence;
    }

    public void setEssence(int essence) {
        this.essence = essence;
    }

    public boolean isMachineOn() {
        return isMachineOn;
    }

    public void setMachineOn(boolean machineOn) {
        isMachineOn = machineOn;
    }

    public boolean isRefrigeratorOn() {
        return isRefrigeratorOn;
    }

    public void setRefrigeratorOn(boolean refrigeratorOn) {
        isRefrigeratorOn = refrigeratorOn;
    }

    public String[] getEmployee() {
        return employee;
    }

    public void setEmployee(String[] employee) {
        this.employee = employee;
    }

    public String getManager() {
        return Manager;
    }

    public void setManager(String manager) {
        Manager = manager;
    }

    public IceCreamFactory(IceCream iceCream, int milk, int sugar, String fruits, int essence, boolean isMachineOn, boolean isRefrigeratorOn, String[] employee, String manager) {
        this.iceCream = iceCream;
        this.milk = milk;
        this.sugar = sugar;
        this.fruits = fruits;
        this.essence = essence;
        this.isMachineOn = isMachineOn;
        this.isRefrigeratorOn = isRefrigeratorOn;
        this.employee = employee;
        Manager = manager;

    }

    public void sellIceCream(int cups){
        totalSales += cups;
        System.out.println(name + " Made and sold " + cups + " of Ice cream from the factory. Total Sales = " + totalSales);
    }
    public void totalSales(){
        System.out.println(" the total sales from the " + name + " Factory is " + this.totalSales);
    }
}
