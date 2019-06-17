public class IceCreamShop {
private String name;
    private IceCream iceCream;
    private int size;
    private String toppings;
    private String cashier;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String customer;
    private String server;
    private double totalSales = 0.0;

    public IceCream getIceCream() {
        return iceCream;
    }

    public void setIceCream(IceCream iceCream) {
        this.iceCream = iceCream;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getToppings() {
        return toppings;
    }

    public void setToppings(String toppings) {
        this.toppings = toppings;
    }

    public String getCashier() {
        return cashier;
    }

    public void setCashier(String cashier) {
        this.cashier = cashier;
    }

    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }

    public String getServer() {
        return server;
    }

    public void setServer(String server) {
        this.server = server;
    }

    public double getTotalSales() {
        return totalSales;
    }

    public void setTotalSales(double totalSales) {
        this.totalSales = totalSales;
    }

    public IceCreamShop(String aName) {
        this.name = aName;
    }

    public IceCreamShop(IceCream iceCream, int size, String toppings, String cashier, String customer, String server, double totalSales) {
        this.iceCream = iceCream;
        this.size = size;
        this.toppings = toppings;
        this.cashier = cashier;
        this.customer = customer;
        this.server = server;
        this.totalSales = totalSales;
    }

    public void sellIceCream(int cups){
        totalSales += cups;
        System.out.println(name + " Cashier sold " + cups + " of IceCream. Total Sales = " + totalSales);
    }
    public void totalSales(){
        System.out.println(" the total sales from the " + name + " shop is " + totalSales);
    }
}
