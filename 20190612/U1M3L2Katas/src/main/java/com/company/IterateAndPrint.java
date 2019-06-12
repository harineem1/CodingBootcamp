package com.company;

import java.util.*;

public class IterateAndPrint {

    public static void main(String[] args) {

        Map<String, String> baseballTeam = new HashMap<>();

        baseballTeam.put("Pitcher", "Mike Foltynewicz");
        baseballTeam.put("Catcher", "Brian McCann");
        baseballTeam.put("First Baseman", "Freddie Freeman");
        baseballTeam.put("Second Baseman", "Ozzie Albies");
        baseballTeam.put("Third Baseman", "Josh Donaldson");
        baseballTeam.put("Shortstop", "Dansby Swanson");
        baseballTeam.put("Left Fielder", "Ronald Acuna, Jr.");
        baseballTeam.put("Center Fielder", "Ender Inciarte");
        baseballTeam.put("Right Fielder", "Nick Markakis");

        Set<String> keys = baseballTeam.keySet();
        for (String key : keys) {
            System.out.println(" Map Keys :" + key);
        }

        Collection<String> values = baseballTeam.values();

        for (String value : values) {
            System.out.println("map values : " + value);
        }

        Set<Map.Entry<String,String>> myEntries = baseballTeam.entrySet();

        System.out.println(myEntries);
        for(Map.Entry<String, String> entry:myEntries){
            System.out.println("key - "+entry.getKey()+" - Value - "+entry.getValue());
        }
    }

}