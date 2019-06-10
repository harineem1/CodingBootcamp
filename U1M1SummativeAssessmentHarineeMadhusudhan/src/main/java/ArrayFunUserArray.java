import java.util.Scanner;

public class ArrayFunUserArray {

    public static void main(String[] args) {
        int[] anArray = new int[5];
        Scanner myScanner = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.println("Please enter a number");
            anArray[i] = Integer.parseInt(myScanner.nextLine());
        }
        for (int i = 0; i < 5; i++) {
            System.out.print(anArray[i] + ",");
        }
    }
}

