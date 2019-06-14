package com.company;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class FindingAValueInAnArrayList {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < 10; i++) {

            list.add(random.nextInt(50));
        }
        System.out.println(list);
        System.out.println("please enter a number");

        Scanner myscanner = new Scanner(System.in);
        int userInput = Integer.parseInt(myscanner.nextLine());
        //System.out.println("Value to find" + userInput);
        if (list.contains(userInput))
                System.out.println(userInput + " is in the ArrayList");
            }
        }




