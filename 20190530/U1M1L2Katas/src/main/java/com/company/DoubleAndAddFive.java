package com.company;

import java.util.Scanner;

public class DoubleAndAddFive {

    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        int Numinput;
        System.out.println(" Enter a number");

        Numinput = Integer.parseInt(myScanner.nextLine());
        int x = (Numinput*2)+5;
        System.out.println(x);


        }
}
