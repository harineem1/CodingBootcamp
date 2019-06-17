import java.util.Random;

public class test {
    public static void main(String[] args) {
        IceCreamShop aa = new IceCreamShop("Ritas Icecream");
        IceCreamShop aa2 = new IceCreamShop("Cool Icecream");
        IceCreamFactory bb = new IceCreamFactory("Jen & Berrys Icecream");

        aa.sellIceCream(2);
        bb.sellIceCream(4);
        aa.sellIceCream(4);
        aa2.sellIceCream(3);
        bb.sellIceCream(4);
        aa2.sellIceCream(4);
        bb.sellIceCream(7);
        bb.sellIceCream(8);
        aa.totalSales();
        aa2.totalSales();
        bb.totalSales();
    }
}



