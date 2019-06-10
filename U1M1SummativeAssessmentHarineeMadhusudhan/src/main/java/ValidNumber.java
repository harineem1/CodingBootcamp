import java.util.Scanner;

public class ValidNumber {
    public static void main(String[] args) {

        Scanner myScanner = new Scanner(System.in);
        System.out.println("Enter a number between 1 and 10");
        int n = Integer.parseInt(myScanner.nextLine());

        if (n>=1 && n<=10){
            System.out.println(n);
        }
        else{
            System.out.println("You must enter a number between 1 and 10, please try again");
        }
    }

}
