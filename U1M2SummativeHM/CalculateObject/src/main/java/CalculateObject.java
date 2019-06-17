public class CalculateObject {
    public void plus(int a, int b) {
        System.out.println(a + " + " + b + " = " + (a + b));
    }

    public void minus(int a, int b) {
        System.out.println(a + " - " + b + " = " + (a - b));
    }

    public void plus(double a, double b) {
        String addValue = String.format ("%.2f", (a + b));
        System.out.println(a + " + " + b + " = " + (addValue));
    }

    public void minus(double a, double b) {
        //System.out.println("Now you gave me floating...");
        String minusValue = String.format ("%.2f", (a - b));
        System.out.println(a + " - " + b + " = " + (minusValue));
    }

    public void multiply(int a, int b) {
        double multipled = (a * b);
        String multiplyValue = String.format("%.2f", multipled);
        System.out.println(a + " * " + b + " = " + (multiplyValue));
    }

    public void divide(int a, int b) {
        double divided = (double) a / (double) b;
        String divideValue = String.format("%.2f", divided);
        System.out.println(a + " / " + b + " = " + divideValue);
    }

    public void multiply(double a, double b) {
        String multiplyValue = String.format("%.2f", (a * b));
        System.out.println(a + " * " + b + " = " + multiplyValue);
    }

    public void divide(double a, double b) {

        String divideValue = String.format("%.2f", (a / b));
        System.out.println(a + " / " + b + " = " + divideValue);
    }
}