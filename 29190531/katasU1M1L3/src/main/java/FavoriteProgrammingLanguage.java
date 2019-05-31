import java.util.Scanner;

public class FavoriteProgrammingLanguage{



        public static void main(String[] args) {
            Scanner myScanner = new Scanner(System.in);
            System.out.println("What is your favorite Programming Language?");
            String inputData = myScanner.nextLine().trim();

            if (inputData.equals("Java")) {
                System.out.println("That's what I was looking for!Java is defenitely the answer");}
       }
}

