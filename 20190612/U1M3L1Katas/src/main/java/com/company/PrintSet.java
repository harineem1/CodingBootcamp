package com.company;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PrintSet {

    public static void main(String[] args) {

        List<Integer> HashSet = new ArrayList<Integer>();
        Map<String, Integer> largest = new HashMap<String, Integer>();

        HashSet.add(5);
        HashSet.add(1);
        HashSet.add(2);
        HashSet.add(1);
        HashSet.add(4);
        HashSet.add(1);
        HashSet.add(5);

        for(Integer element : HashSet) {
            System.out.println(element);


        }

    }

}
