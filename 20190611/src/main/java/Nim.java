import java.util.Scanner;
public class Nim {
    public static void main(String[] args) {

        int PileA = 3;
        int PileB = 3;
        int PileC = 3;
        int userInput = 0;
        String pile;
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Player 1 Enter your name:");
        String player1 = myScanner.nextLine();
        System.out.println(" Player 2 Enter your name");
        String player2 = myScanner.nextLine();
        Boolean isPlayer1 = true;
        while ((PileA >0 ) || (PileB > 0) || (PileC >0)){
            System.out.println("-------------------------------------------------");
            if (isPlayer1) {
                System.out.println("This is the turn of " + player1);
            }
            else {
                System.out.println("This is the turn of " + player2);
            }
            System.out.println("A= " + PileA + " B= " + PileB + " C= " + PileC);
            System.out.println("Choose a pile, A or B or C");
            pile = myScanner.nextLine();
            System.out.println("How many to remove from "+ pile);
            userInput = Integer.parseInt(myScanner.nextLine());

            switch (pile) {
                case  "A":
                    PileA = PileA - userInput;
                    break;

                case "B":
                    PileB = PileB - userInput;
                    break;

                case "C":
                    PileC = PileC - userInput;
                    break;
            }
        isPlayer1 = !isPlayer1;
        }
        if (PileA <= 0 && PileB <= 0 && PileC <= 0) {
            System.out.println("All piles are empty. Good job!");
            if (isPlayer1) {
                System.out.println(player1 + " is the winner");
            }
            else {
                System.out.println(player2 + " is the winner");
            }
        }
        else {
            System.out.println("Some Error");
        }
    }
}