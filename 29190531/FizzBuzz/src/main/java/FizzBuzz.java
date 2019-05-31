package com.company;

public class FizzBuzz {

    public static void main(String[] args) {
        String aPrint;
        for (int i = 1; i < 101; i++) {
            aPrint = "";
            if (i % 3 == 0) {
                aPrint = "FIZZ";
            }
            if (i % 5 == 0) {
                aPrint += "BUZZ";
            }
            if (aPrint == "") {
                aPrint = Integer.toString(i);
            }
            System.out.println(aPrint);
        }
    }
}

