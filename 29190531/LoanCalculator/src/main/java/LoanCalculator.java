package com.company;

import java.util.Scanner;

public class LoanCalculator {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Please provide the Loan Amount");
        String amt = myScanner.nextLine();
        System.out.println("Please provide the Loan Term");
        String term = myScanner.nextLine();
        System.out.println("Please provide the Loan Rate");
        String rate = myScanner.nextLine();

        float L = Float.parseFloat(amt);
        double n = Double.parseDouble(term) * 12;
        double mortgageRate = Double.parseDouble(rate);
        double c = (double) (mortgageRate / 1200);

        double payment = 0;
        double onePlusCpowern = Math.pow((1 + c), n);
        System.out.println(onePlusCpowern);
        double P = L * (c * onePlusCpowern) / (onePlusCpowern - 1);

        System.out.println("Monthly Payment is");
        System.out.printf("%.3f", P);
    }
}
