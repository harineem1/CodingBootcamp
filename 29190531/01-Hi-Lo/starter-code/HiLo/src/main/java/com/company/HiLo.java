package com.company;


import java.util.Random;
import java.util.Scanner;

public class HiLo {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Random random = new Random();

        int num = random.nextInt(100) + 1;
        int userNum;
        int guess = 0;
        System.out.println("Welcome to HiLo Game! " );
        System.out.println("Ok Here are the rules! " );
        System.out.println("Just for your reference "  + num);

        do{
            System.out.println("guess the number between 1 and 100");
            String userInput = scanner.nextLine();
            userNum = Integer.parseInt(userInput);
            guess = guess + 1;
            if (userNum < num) {
                System.out.println("Too Low");}
            if (userNum > num) {
               System.out.println("Too High");}
        }  while(userNum != num);

        System.out.println("congratulations you won");
        System.out.println(" It took you " + guess +" guesses to find my number");

    }}