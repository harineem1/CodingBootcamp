package com.company;

import java.util.ArrayList;
import java.util.Random;

public class CopyingArrayLists {

    public static void main(String[] args) {

        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();

        Random random = new Random();

        for (int i = 0; i < 10; i++) {
            list1.add(random.nextInt(100) + 1);
        }



        for (int i = 0; i < list1.size(); i++) {
            list2.add(list1.get(i));
        }

        list1.set(list1.size()-1, -7);
        System.out.println("1" + list1);
        System.out.println("2" + list2);



    }
}