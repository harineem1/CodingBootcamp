import java.util.Scanner;

public class CountTo {

    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Enter a number input");
        String  numString =myScanner.nextLine();

        int aNumber = Integer.parseInt(numString);
        for ( int i=0; i<= aNumber; i++) {
            System.out.println(i);
        }
    }


    }

