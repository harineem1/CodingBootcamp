import java.util.Scanner;

public class AgeAgain {

    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Enter Your Age");
        String numString = myScanner.nextLine();
        int age = Integer.parseInt(numString);
        String canDo = "";
        if (age < 14) {
            System.out.println("What Grade are you in");
            String userGrade = myScanner.nextLine();
            System.out.println("Wow!" + userGrade + " grade - that sounds exciting");
        }
        if ((age >= 14) && (age <= 18)) {
            System.out.println("Are you planning to go to College");
            String userGoToCollege = myScanner.nextLine();
            if (userGoToCollege.equals("yes")) {
                System.out.println("What College");
                String userCollegeName = myScanner.nextLine();
                System.out.println(userCollegeName + " is a great school!");
            }
            else {
                System.out.println("What do you want to do agter high school");
                String userCollegeName = myScanner.nextLine();
                System.out.println("Wow, sounds like a plan!");
            }
        }
        if (age > 18) {
            System.out.println("What is your job");
            String userJobName = myScanner.nextLine();
            System.out.println(userJobName + " sounds like a great job!");
        }
    }
}