package com.company.usingarrays;
 import java.util.List;
 import java.util.ArrayList;

public class Total {

    public static void main(String[] args) {

        int [] numbers = {2, 4, 5, 3,
                7, 6, 1, 9,
                10, 13, 56, 43};

        int total = 0;

        for(int element : numbers) {
          total += element;
        }

        System.out.println("The sum of all elements in the array is " + total);

        List<String> myList = new ArrayList<String>();
        System.out.println("Size of my List = " + myList.size());

    }

}
