package com.company;

import java.util.Scanner;

public class App {

    public static int total(int[] arr1) {
        int sum = 0;
        int j = 0;
        while (j < arr1.length) {
            sum = sum + arr1[j];
            j++;
        }
        return sum;
    }

    public static int totalOdd(int[] arr) {
        int totalOdd = 0;
        int i = 0;
        while (i < arr.length) {
            if (i % 2 == 1) { // If index is odd
                totalOdd += arr[i];
            }
            i++;
        }
        return totalOdd;

    }

    public static int totalEven(int[] arr) {
        int totalEven = 0;
        int i = 0;
        while (i < arr.length) {
            if (i % 2 == 0) //If index is even
                totalEven += arr[i];
            i++;
        }
        return totalEven;
    }

    public static int secondLargestNumber(int[] arr) {


        int max1, max2;

        if (arr[0] > arr[1]) {
            max1 = arr[0];
            max2 = arr[1];
        } else {
            max1 = arr[1];
            max2 = arr[0];
        }

        for (int i = 2; i < arr.length; i++) {
            if (arr[i] > max1) {
                max2 = max1;
                max1 = arr[i];
            }
            if ((arr[i] > max2) && (arr[i] < max1)) {
                max2 = arr[i];
            }
            System.out.println(max1 + " " + max2);
        }
        return max2;
    }

    public static String[] swapFirstAndLast(String[] arr) {
        String temp;
        temp = arr[0];
        arr[0] = arr[arr.length - 1];
        arr[arr.length - 1] = temp;
        return arr;
    }

    public static int[] reverse(int [] arr) {
        int arrLength = arr.length;
        int[] arr2 = new int[arr.length];
        for (int i = 0; i < arrLength; i++) {
            arr2[i] = arr[arrLength - i - 1];
        }
        return arr2;
    }
    public static String concatenateString(String [] arr){
        String outPut = "";
        for ( int i=0; i< arr.length; i++) {
            outPut += arr[i];

        }
        return outPut;
    }
    public static int [] everyThird(int [] arr) {
        if (arr.length < 3 ) {return null;}
        int outLength = arr.length/3;
        int[] everyThird = new int[outLength];
        int j = 0;
        for( int i = 2; i< arr.length; i=i+3){
           everyThird[j] = arr[i]  ;
           j++;
            }
        return everyThird;
    }

    public static int [] lessThanFive(int [] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 5) {
                count++;
            }}
            if (count == 0) {
                return null;
            }
            int[] lessThanFive = new int[count];
            int j = 0;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] < 5) {
                lessThanFive[j] = arr[i];
                j++;}
            }
            return lessThanFive;
        }


    public static void main(String[] args) {

        //String[] stringTest1 = new String[] {"foo", "bar", "baz", "qux"};
        //int[] intTest1 = new int[] {0, 1, 2, 3, 4, 5, 6, 7};
       // System.out.println(swapFirstAndLast(stringTest1));
           //System.out.println(reverse(intTest1));
        //    System.out.println(total(intTest1));
        // System.out.println(totalOdd(intTest1));
        //   System.out.println(totalEven(intTest1));
        //   System.out.println(secondLargestNumber(intTest1));
    }
}