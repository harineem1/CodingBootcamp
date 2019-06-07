import java.util.Random;
import java.util.Scanner;

public class AddingValuesInaLoop {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        int userInput;
        int sum = 0;

        do
        {System.out.print("Number: "+" ");
            userInput = Integer.parseInt(myScanner.nextLine());
            sum += userInput;
            if (userInput != 0)
                System.out.println("The total so far is " + sum);
        }while(userInput !=0);
        System.out.println("the total is "+ sum);
        }

    }



