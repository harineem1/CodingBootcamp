import java.util.Scanner;
import java.util.SortedMap;

public class RegistrationForm {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        System.out.println(" What is your First Name?");
        String name = myScanner.nextLine();

        System.out.println(" What is your Last Name?");
        String last = myScanner.nextLine();

        System.out.println((" What is your email?"));
        String id = myScanner.nextLine();

        System.out.println("what is your Twitter handle?");
        String handle = myScanner.nextLine();

        System.out.println("What is your age");
        int age = myScanner.nextByte();

        System.out.println("What is your Nationality");
        String country1 = myScanner.nextLine();


        System.out.println("What is your Profession");
        String profession = myScanner.nextLine();

        System.out.println("What is your favorite operating system");
        String op = myScanner.nextLine();

        System.out.println("What is your favorite programming language");
        String pl = myScanner.nextLine();

        System.out.println("What is your favorite computer assistant");
        String ca = myScanner.nextLine();

        System.out.println("What is your favorite keyboard shortcut");
        String ks = myScanner.nextLine();

        System.out.println("Have you ever built your own computer?");
        String ans = myScanner.nextLine();

        System.out.println("If you could be any superhero, who would it be?");
        String who = myScanner.nextLine();

        System.out.println("First Name" +" : " + name);
        System.out.println("Last name" + ": "+ last );
        System.out.println( "Email" + ":"+ id );
        System.out.println("Twitter handle"+ ":"+ handle);
        System.out.println("Age"+ ":"+ age);
        System.out.println("Country"+":"+country1);
        System.out.println("Profession"+":"+ profession);
        System.out.println("Favorite Operating System"+":"+ op);
        System.out.println("Favorite Programmig language"+":"+ pl);
        System.out.println("Favorite computer assitant"+":"+ ca);
        System.out.println("Favorite keyboard shortcut"+":"+ ks);
        System.out.println(ans);
        System.out.println(who);













    }
}
