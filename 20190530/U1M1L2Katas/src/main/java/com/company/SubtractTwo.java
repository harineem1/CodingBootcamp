package com.company;

import java.util.Scanner;
import java.util.SortedMap;

public class SubtractTwo {

    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        int Numinput;

        System.out.println(" Enter a number");
        Numinput = Integer.parseInt(myScanner.nextLine());
        int x = (Numinput - 2);
        System.out.println(x);

    }
}
