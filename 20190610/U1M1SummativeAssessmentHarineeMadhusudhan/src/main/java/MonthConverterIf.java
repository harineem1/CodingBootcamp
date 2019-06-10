import java.util.Scanner;

public class MonthConverterIf {

    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Enter a number between 1 and 12");

        int m = Integer.parseInt(myScanner.nextLine());
        String[] months = {"January", "February", "March","April",
                           "May","June", "July", "August","September","October", "november","December"};
     if (m >=1 && m<=12) {
         System.out.println(months[m-1]);
        }
     else{
            System.out.println("You have entered an invalid number. You must enter a number between 1 and 12. Goodbye.");
        }


    }

}
