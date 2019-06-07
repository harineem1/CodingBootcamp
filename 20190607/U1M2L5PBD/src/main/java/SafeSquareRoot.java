import java.util.Scanner;

public class SafeSquareRoot {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("enter a number");
        double x = 0;
        boolean loopFlag = false;
        do {
            double n = Integer.parseInt(myScanner.nextLine());
            if (n < 0) {
                System.out.println("not a valid one.Can you enter another positive number");
            }
            else {
                x = Math.sqrt(n);
                System.out.println(" The square root of the number is " + x);
                loopFlag = true;
            }
        } while (!loopFlag);
    }
}