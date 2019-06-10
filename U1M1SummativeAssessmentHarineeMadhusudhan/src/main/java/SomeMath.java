import java.util.Scanner;

public class SomeMath {

    public static int total5(int a, int b, int c, int d, int e){
          int total5 = (a+b+c+d+e);
          return total5;
        }
    public static double average5(int a, int b, int c, int d, int e){

            int average5 = ((a+b+c+d+e)/5);
            return average5;
        }
    public static double largest5(double a, double b, double c, double d, double e){

           double aLargest;
           aLargest = a;
           if (b > aLargest) {aLargest = b;}
           if (c > aLargest) {aLargest = c;}
           if (d > aLargest) {aLargest = d;}
           if (e > aLargest) {aLargest = e;}
           return aLargest;
     }

    public static void main(String[] args) {
        int aTotal = total5(1,2,3,4,5);
        System.out.println(aTotal);
        double anAverage = average5(1,2,3,4,5);
        System.out.println(anAverage);
        double aLargest = largest5(42.0, 35.1, 2.3, 40.2, 15.6.);
    }
}
