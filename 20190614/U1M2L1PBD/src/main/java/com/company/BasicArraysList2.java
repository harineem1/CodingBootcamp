package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class BasicArraysList2 {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<Integer>();
        Random random = new Random();

        for (int i = 0; i < 10; i++)
        {
            list.add(random.nextInt(100));
        }
        System.out.println(list);
    }

 }






