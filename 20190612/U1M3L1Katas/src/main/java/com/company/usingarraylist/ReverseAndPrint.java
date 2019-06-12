package com.company.usingarraylist;
import java.util.Collections;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;
public class ReverseAndPrint {

    public static void main(String[] args) {

        System.out.println("--------------");
        System.out.println("Original Array");
        System.out.println("--------------");

        List<Integer> numList = new ArrayList<Integer>();
        numList.add(2);
        numList.add(4);
        numList.add(5);
        numList.add(3);
        numList.add(7);
        numList.add(6);
        numList.add(1);
        numList.add(9);
        numList.add(10);
        numList.add(13);
        numList.add(56);
        numList.add(43);

        System.out.println(numList);

        //for (Integer element : numList) {
        //System.out.println(element);
        //}//
        System.out.println("----------------");
        System.out.println("Swapped Array");
        System.out.println("----------------");


        Collections.reverse( numList);

        System.out.println(numList);

    }
  }

