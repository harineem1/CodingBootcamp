package com.company;

import javax.sound.midi.Soundbank;
import java.util.ArrayDeque;
import java.util.Scanner;
import java.util.SortedMap;

public class SpaceBoxing {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("please enter your current earth weight");
        int earthWeight = Integer.parseInt(myScanner.nextLine());

        System.out.println("\n" + " I have information for the following planets:");
        System.out.println(" 1. Venus   2. Mars    3. Jupiter");
        System.out.println("4. Saturn  5. Uranus  6. Neptune");

        System.out.println("Which planet are you visiting? ");
        int planet = Integer.parseInt((myScanner.nextLine()));

//        int addedWeight = Integer.parseInt(myScanner.nextLine());
          double newWeight = addedweight(earthWeight, planet);

        System.out.printf("your weight would be %.2f pounds on that planet.", newWeight);

    }

    public static double addedweight(int earthweight, int planet) {

        double relativeWeight = 0;
        switch (planet) {

            case 1:
                relativeWeight = 0.78;
                break;
            case 2:
                relativeWeight = 0.39;
                break;
            case 3:
                relativeWeight = 2.65;
                break;
            case 4:
                relativeWeight = 1.17;
                break;
            case 5:
                relativeWeight = 1.05;
            case 6:
                relativeWeight = 1.23;
                break;
        }

        double newWeight = relativeWeight * earthweight;
        return newWeight;
    }
}

