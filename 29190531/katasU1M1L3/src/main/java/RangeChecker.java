import java.util.Scanner;

public class RangeChecker {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        int aNumber;
        do {
            System.out.println("Enter a number between 15 and 32");
            String numString = myScanner.nextLine();
            aNumber = Integer.parseInt(numString);
            System.out.println("You entered " + aNumber);
        } while ((aNumber <= 15) || (aNumber >= 32));
        System.out.println("Done");
    }
}
