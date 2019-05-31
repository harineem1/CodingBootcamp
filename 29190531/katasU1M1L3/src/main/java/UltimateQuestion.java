
import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Scanner;

public class UltimateQuestion {

    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        int aNumber;
        do {
            System.out.println("Enter a number input");
            String numString = myScanner.nextLine();
             aNumber = Integer.parseInt(numString);
        } while (aNumber != 42);
        System.out.println("That is the number I was looking for! 42 is definitely the answer");
    }
}