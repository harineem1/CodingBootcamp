import java.util.Scanner;
public class BabyNim {
    public static void main(String[] args) {

        int PileA = 3;
        int PileB = 3;
        int PileC = 3;
        int userInput = 0;
        String pile;
        Scanner myScanner = new Scanner(System.in);

        while ((PileA >0 ) || (PileB > 0) || (PileC >0)){

        System.out.println("A :" + PileA + "B: " + PileB + "C: " + PileC);
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

    }
        if (PileA <= 0 && PileB < 0 && PileC < 0) {
            System.out.println("All piles are empty. Good job!");
            return;
    }
    }
}