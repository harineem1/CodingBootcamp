package com.company;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class BasicArraysList1 {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<Integer>();

        for( int i =0; i<10; i++){
            list.add (-113);

         for ( i =0; i< list.size(); i++){
             System.out.println("Slot " + i + " contains" + list.get(i));
         }

        }


    }

}
