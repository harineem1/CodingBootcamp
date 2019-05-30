import java.util.Scanner;

public class LuxuryTax {
    public static void main(String[] args) {

        Scanner myScanner = new Scanner(System.in);
        int salary1Input;
        int salary2Input;
        int salary3Input;

        System.out.println("Enter a number;");
        salary1Input = Integer.parseInt(myScanner.nextLine());
        System.out.println("Enter a number:");
        salary2Input = Integer.parseInt(myScanner.nextLine());
        System.out.println("Enter a number:");
        salary3Input = Integer.parseInt(myScanner.nextLine());

        int sum = (salary1Input +salary2Input + salary3Input);

        System.out.println(sum);

        if (sum > 40000000) {
             int taxableAmt = sum -40000000;

            System.out.println("luxury tax is " + "$" + (taxableAmt*.18));
        }




    }
}

