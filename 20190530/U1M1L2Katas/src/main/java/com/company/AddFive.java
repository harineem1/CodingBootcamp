package com.company;

import java.util.Scanner;

public class AddFive {

    public static void main(String[] args) {
        Scanner myScanner = new Scanner( System.in);
        int Numinput;

        System.out.println(" Enter a number");
        Numinput = Integer.parseInt(myScanner.nextLine());

        int add = (Numinput + 5);
        System.out.println(add);



    }
}
