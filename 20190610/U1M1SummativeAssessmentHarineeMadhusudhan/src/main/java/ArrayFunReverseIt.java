import java.util.Scanner;

public class ArrayFunReverseIt {

      public static void main(String[] args) {
            int[] anArray = new int[5];
            int[] revArray = new int[5];
            Scanner myScanner = new Scanner(System.in);
            for (int i = 0; i < 5; i++) {
                System.out.println("Please provide a number");
                anArray[i] = Integer.parseInt(myScanner.nextLine());
            }
          for (int i = 0; i < 5; i++) {
              revArray[4-i] = anArray[i];
          }
          for (int i = 0; i < 5; i++) {
                System.out.print(anArray[i] + ",");
            }
          System.out.println("");
          for (int i = 0; i < 5; i++) {
              System.out.print(revArray[i] + ",");
          }
          System.out.println("-----------");
          for (int i = 0; i < 5; i++) {
              System.out.print(anArray[4-i] + ",");
          }
          for (int i = 4; i => 0; i--) {
              System.out.print(anArray[i] + ",");
          }
        }
    }


