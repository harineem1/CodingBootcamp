import java.util.Random;
import java.util.Scanner;

public class ThreeCardMonte {
    public static void main(String[] args) {
        System.out.println("You slide up to Fast Eddie's card table and plop down your cash.\n" +
                "He glances at you out of the corner of his eye and starts shuffling.\n" +
                "He lays down three cards.");;

        Scanner myScanner =new Scanner(System.in);
        System.out.println("Which one is the ace? ");
        System.out.println("Enter a number 1,2 or 3");
        int userInput = Integer.parseInt(myScanner.nextLine());

        int ace = 0;
        Random card = new Random();
        int[] numbers = {1, 2, 3};
        ace = numbers[card.nextInt(3)];

        if(ace == 1)
        { System.out.println("\tAA ## ##\n\tAA ## ##\n\t1  2  3"); }
        else if(ace == 2)
        {System.out.println(("\t## AA ##\n\t## AA ##\n\t1  2  3")); }
        else if(ace == 3)
        {
            System.out.println("\t## ## AA\n\t## ## AA\n\t1  2  3");
        }

        if(userInput == ace)
        {
            System.out.println("you are right");
        }
        else if(userInput != ace)
        {
            System.out.println("wrong");
        }


    }


}
