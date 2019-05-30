package com.company;

import java.util.Scanner;

public class AddThirteen {

    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        int Numinput;
        System.out.println("Enter a number");
        Numinput = Integer.parseInt(myScanner.nextLine());

        int add = Numinput+13;

        System.out.println(add);

    }
}
