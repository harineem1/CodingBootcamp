import java.util.Scanner;
import java.util.SortedMap;

public class RightTriangleChecker {
    public static void main(String[] args) {

        Scanner myScanner = new Scanner(System.in);
        int a, b, c = 0;

        System.out.println("Side 1 : ");
        a = Integer.parseInt(myScanner.nextLine());

        do {
            System.out.println("Side 2 : ");
            b = Integer.parseInt(myScanner.nextLine());
            if (b < a)
                System.out.println(b + " is smaller than " + a + ". Try again");
        } while (b < a);

        do {
            System.out.println("Side 3 : ");
            c = Integer.parseInt(myScanner.nextLine());
            if (c < b)
                System.out.println(c + " is smaller than " + b + ". Try again");
        } while (c < b);

        System.out.println( "Your three sides are " + a + ", " + b+ ", and " + c + "." );
        double right = Math.sqrt( a * a + b * b );

        if ( right == c ) {
            System.out.println( "Those sides make a right triangle!" );
        }

        else {
            System.out.println( "Nope, not a right triangle" );
        }
    }
}