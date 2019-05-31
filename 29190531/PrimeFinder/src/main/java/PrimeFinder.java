import java.util.Scanner;

public class PrimeFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the ceiling number");
        int aCeiling = Integer.parseInt(scanner.nextLine());
        System.out.println(aCeiling);
        for (int aNumber = 1; aNumber <= aCeiling; aNumber++) {
            boolean isPrime = true;
            for (int i = 2; i < aNumber; i++) {
                if (aNumber % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.println(aNumber + " is Prime");
            }
        }
    }}
