import java.util.Scanner;

public class RectangularPavingCompany {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        double widthInput;
        double lengthInput;

        System.out.println(" Enter the width in feet");
        widthInput = Integer.parseInt(myScanner.nextLine());
        System.out.println(" enter the length in feet");
        lengthInput = Integer.parseInt(myScanner.nextLine());

        double area = widthInput * lengthInput;
        System.out.println(area+ " sqft");

        double perimeter = (widthInput + lengthInput)* 2;
        System.out.println(perimeter + " ft");

        double cementcost;
        cementcost = (area * 12.50);
        System.out.println("The cost of Cementing is "+ "$"+ cementcost);
        double framingcost;
        framingcost = (perimeter * 8.25);
        System.out.println("The cost of framing is "+"$"+ framingcost);

        //Version2
        double cementcost1;
        System.out.println("Enter the cost of cement");
        cementcost1 = Double.parseDouble(myScanner.nextLine());
        cementcost1 = (area * cementcost1);
        System.out.println("The cost of Cementing" +"$"+ cementcost1);

        double framingcost1;
        System.out.println("Enter the cost of framing");
        framingcost1 = Double.parseDouble(myScanner.nextLine());
        framingcost1= (perimeter * framingcost1);
        System.out.println("The cost of framing is "+"$"+ framingcost1);






    }
}
