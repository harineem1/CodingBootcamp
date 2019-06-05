package com.company;
import java.util.Random;
import java.util.Scanner;
public class KeepGuessing {

    public static void main(String[] args) {
        Random rand = new Random();
        int randint = rand.nextInt(10);
        System.out.println("I am thing of anumber from 1 to 10");
        Scanner myScanner = new Scanner(System.in);
        int userInput= Integer.parseInt(myScanner.nextLine());

        while (randint != userInput){
            System.out.println("That is incorrect.Guess again "  );
            userInput= Integer.parseInt(myScanner.nextLine());;
        }
        if (randint == userInput){
            System.out.println(" Yes you are right");
        }
    }
}





