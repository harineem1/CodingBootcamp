package com.company.mapfun;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapFun {
    public static void main(String[] args) {

        Map<String, Integer> carmap = new HashMap<String, Integer>();

        carmap.put("Toyota Camry", 2012);
        carmap.put("Chevy Camaro", 1969);
        carmap.put("Hyundai Genesis", 2015);
        carmap.put("Jeep Wrangler", 2003);
        carmap.put("Honda Civic", 2018);
        carmap.put("Toyota Supra", 1995);
        carmap.put("Pontiac GTO", 1964);

        Set<Map.Entry<String, Integer>> myEntries = carmap.entrySet();

        System.out.println(myEntries);
        for (Map.Entry<String, Integer> entry : myEntries) {
            System.out.println("key - " + entry.getKey() + " - Value - " + entry.getValue());
        }
        carmap.put("Ford Explorer", 2012);
        carmap.put("Smart Fortwo", 2013);

        System.out.println(myEntries);
        for (Map.Entry<String, Integer> entry : myEntries) {
            System.out.println("key - " + entry.getKey() + " - Value - " + entry.getValue());
        }
        carmap.remove("Jeep Wrangler");

        System.out.println(myEntries);
        for (Map.Entry<String, Integer> entry : myEntries) {
            System.out.println("key - " + entry.getKey() + " - Value - " + entry.getValue());
        }








    }




}
