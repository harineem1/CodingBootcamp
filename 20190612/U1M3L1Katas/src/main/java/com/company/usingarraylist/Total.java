package com.company.usingarraylist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Total {

        public static void main(String[] args) {

            List<Integer> myList = new ArrayList<Integer>();

            myList.add(2);
            myList.add(4);
            myList.add(5);
            myList.add(3);
            myList.add(7);
            myList.add(6);
            myList.add(1);
            myList.add(9);
            myList.add(10);
            myList.add(56);
            myList.add(43);


                int sum =0;
                for(int i = 0; i < myList.size(); i++)
                    sum += myList.get(i);


            System.out.println("The sum of all elements in the array is " + sum);

            }
        }


