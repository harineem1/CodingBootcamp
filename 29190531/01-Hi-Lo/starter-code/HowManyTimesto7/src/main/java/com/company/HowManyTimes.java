package com.company;

import java.util.Random;
import java.util.Scanner;

public class HowManyTimes {

    public static void main(String[] args) {
        Random dice = new Random();

        int count7 =0 , count2=0, count3=0, count4=0, count5=0, count6 = 0;
        int count8 = 0, count9=0, count10=0, count11=0, count12=0;
        int firstRoll7Count = 0;
        int firstDice;
        int secondDice;
        int roll = 0;
        int rollCount = 0;

        for (int i = 0; i < 100; i++) {
            firstDice = dice.nextInt(6) + 1;
            secondDice = dice.nextInt(6) + 1;
            roll = (firstDice + secondDice);
            rollCount += 1;
            //System.out.println("time=" + rollCount + ",firstDice = " + firstDice + ",secondDice = " + secondDice);
            if (roll == 7) {
                count7 += 1;
                if (firstRoll7Count == 0) {
                    firstRoll7Count = rollCount;}
                }
            if (roll == 2) {
                count2 += 1;
            }
            if (roll == 3) {
                count3 += 1;
            }
            if (roll == 4) {
                count4 += 1;
            }
            if (roll == 5) {
                count5 += 1;
            }
            if (roll == 6) {
                count6 += 1;
            }
            if (roll == 7) {
                count7 += 1;
            }
            if (roll == 8) {
                count8 += 1;
            }
            if (roll == 9) {
                count9 += 1;
            }
            if (roll == 10) {
                count10 += 1;
            }
            if (roll == 11) {
                count11 += 1;
            }
            if (roll == 12) {
                count12 += 1;
            }
        }


        System.out.println("No of times 7 rolled is equal to " + count7);
        System.out.println("No of times 2 rolled is equal to " + count2);
        System.out.println("No of times 3 rolled is equal to " + count3);
        System.out.println("No of times 4 rolled is equal to " + count4);
        System.out.println("No of times 5 rolled is equal to " + count5);
        System.out.println("No of times 6 rolled is equal to " + count6);
        System.out.println("No of times 8 rolled is equal to " + count8);
        System.out.println("No of times 9 rolled is equal to " + count9);
        System.out.println("No of times 10 rolled is equal to " + count10);
        System.out.println("No of times 11 rolled is equal to " + count11);
        System.out.println("No of times 12 rolled is equal to " + count12);
        System.out.println("First time 7 was rolled is equal to " + firstRoll7Count);


    }
}
