import java.util.Scanner;

public class ConverterApplication  {

    public static void main(String[] args) {

       ConverterIf c = new ConverterIf();
       ConverterSwitch s = new ConverterSwitch();

        Scanner myScanner = new Scanner((System.in));
        System.out.println( "Enter a number between 1 and 12");
        int userInput = Integer.parseInt(myScanner.nextLine());
        System.out.println( c.converterMonth(userInput) + " is the corresponding month using ConverterIf.");
        System.out.println( s.converterMonth(userInput) + " is the corresponding month using ConverterSwitch.");

        System.out.println( "Enter a number between 1 and 7");
        userInput = Integer.parseInt(myScanner.nextLine());
        System.out.println( c.convertDay(userInput) + " is the corresponding day.");
        System.out.println( s.convertDay(userInput) + " is the corresponding day.");
    }
}
