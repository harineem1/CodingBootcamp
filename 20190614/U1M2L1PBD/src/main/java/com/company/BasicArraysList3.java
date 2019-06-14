package com.company;

import java.util.ArrayList;
import java.util.Random;

public class BasicArraysList3 {

    public static void main(String[] args) {

        ArrayList<Integer>list = new ArrayList<>();
        Random random = new Random();

        for ( int i = 0; i < 1000; i++){

            list.add(random.nextInt(90)+10);

        }
        System.out.println(list);

    }
}
