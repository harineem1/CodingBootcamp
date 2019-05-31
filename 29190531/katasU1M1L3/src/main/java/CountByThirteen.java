import java.util.Scanner;

public class CountByThirteen {

    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Enter a number input");
        String numString = myScanner.nextLine();

        int aNumber = Integer.parseInt(numString);
        for (int i = 0; i <= aNumber; i+=13) {
            System.out.println(i);
        }
    }
}