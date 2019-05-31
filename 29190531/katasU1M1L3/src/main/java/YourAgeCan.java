
import java.util.Scanner;

public class YourAgeCan {

    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Enter Your Name");
        String numString = myScanner.nextLine();

        int age = Integer.parseInt(numString);
        String canDo = "";
        if (age >= 18) {
            canDo += "Can Vote ";
        }
        if (age >= 21) {
            canDo += "Can Drink Alcohol ";
        }
        if (age >= 35) {
            canDo += "Can Be president ";
        }
        if (age >= 55) {
            canDo += "Is eligible for AARP ";
        }
        if (age >= 65) {
            canDo += "Can Retire ";
        }
        if (age >= 80 && age <= 89) {
            canDo += "Is an octogenarian ";
        }
        if (age >= 100) {
            canDo += "Is More than acentury old ";
        }
        System.out.println("A person of age " + age + " " + canDo);
    }
}