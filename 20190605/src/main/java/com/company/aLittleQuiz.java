package com.company;

import java.util.Scanner;
import java.util.SortedMap;

public class aLittleQuiz {
    public static void main(String[] args) {

        Scanner myScanner = new Scanner(System.in);
        System.out.println("Are you ready for a Quiz? Y/N");
        String ans = myScanner.nextLine();
        if (ans == "Y") {
            System.out.println("okay. Here it comes");}

            System.out.println(" Q1) What is the capital of Alaska?\n" +
                    "\t1) Melbourne\n" +
                    "\t2) Anchorage\n" +
                    "\t3) Juneau");

            int userInput = Integer.parseInt(myScanner.nextLine());
            if (userInput == 3) {
                System.out.println("That's Right!");
            } else {
                System.out.println(" please try again");

            }
        }
    }








