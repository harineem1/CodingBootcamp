import java.util.Scanner;

public class practice30th {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner((System.in));

        System.out.println(" Enter Department");
        String dep = myScanner.nextLine();

        switch(dep) {
            case "C":
            case "c":
            System.out.println("Customer care");
                break;
            case "S":
            case "s":
                 System.out.println("Sales");
                 break;
            default:
                 System.out.println("invalid");
             break;

        }
        }
        }


