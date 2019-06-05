package com.company;
import java.util.Random;
    public class fortuneCookies {
        public static void main(String[] args) {

            Random rand = new Random();
            int randint1 = rand.nextInt(10);
            int randint2;

            String myArray[];
            myArray = new String[10];
            myArray[1] = " you will have a lucky day!!";
            myArray[2] = " you will have a lucky day!!";
            myArray[3] = " you will have a lucky day!!";
            myArray[4] = " you will have a lucky day!!";
            myArray[5] = " you will have a lucky day!!";
            myArray[6] = " you will have a lucky day!!";
            myArray[7] = " you will have a lucky day!!";
            myArray[8] = " you will have a lucky day!!";
            myArray[9] = " you will have a lucky day!!";
            myArray[0] = " you will have a lucky day!!";

            System.out.println(myArray[randint1]);
            for (int j = 0; j < 6; j++){
                System.out.print(" " + (rand.nextInt(54) + 1 ));

            };

        }
    }
