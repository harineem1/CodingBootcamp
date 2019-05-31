import java.util.Random;
import java.util.Scanner;

public class practice3 {
    public static void main(String[] args) {
      Random random = new Random();

      for (int i=0; i<10; i++) {
          int rollValue = random.nextInt(5) + 1;
          System.out.println(rollValue);
      }
    }
}
