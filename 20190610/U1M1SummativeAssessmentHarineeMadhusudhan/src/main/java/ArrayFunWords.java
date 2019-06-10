import java.util.Scanner;

public class ArrayFunWords {

    public static void main(String[] args) {
            String[] anArray = new String[5];
            Scanner myScanner = new Scanner(System.in);
            for (int i = 0; i < 5; i++) {
                System.out.println("Please provide a word");
                anArray[i] = (myScanner.nextLine());
            }
            for (int i = 0; i < 5; i++) {
                System.out.print(anArray[i] + ",");
            }
        }
    }

