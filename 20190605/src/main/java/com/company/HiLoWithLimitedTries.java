package com.company;

import java.util.Random;
import java.util.Scanner;

public class HiLoWithLimitedTries {

    public static void main(String[] args) {
        Random rand = new Random();
        int randint = rand.nextInt(100);
        System.out.println("I am thing of a number from 1 to 100.You have 7 guesses");
        Scanner myScanner = new Scanner(System.in);
        int userInput= Integer.parseInt(myScanner.nextLine());
        int count = 1;
        while ((randint != userInput) && count <=7){
            if (randint > userInput) {
                System.out.println("you are too low");
            }
            else {
                System.out.println("Your guess is too high " + randint);
            }
            if (randint == userInput){
            userInput= Integer.parseInt(myScanner.nextLine());
            count++;
        }
            System.out.println(" Yes you are right");
        }
        if (count > 7) {
            System.out.println("You exceeded a max of 7 attempts");
        }
    }
}



