import java.util.Scanner;

public class EvenOrOdd {

    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Enter a number input");
        String numString = myScanner.nextLine();

        int aNumber = Integer.parseInt(numString);
        if ((aNumber % 2 ) == 0){
            System.out.println("The Number " + aNumber + " is even");
        }
        else {
            System.out.println("The Number " + aNumber + " is odd");

        }
    }
}