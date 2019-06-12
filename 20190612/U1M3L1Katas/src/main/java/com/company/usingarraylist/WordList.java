package com.company.usingarraylist;

import java.util.Iterator;

import java.util.List;
import java.util.ArrayList;

public class WordList {

    public static void main(String[] args) {

        List<String> myList = new ArrayList<String>();

        myList.add("byte");
        myList.add("case");
        myList.add("catch");
        myList.add("class");
        myList.add("const");
        myList.add("continue");
        myList.add("do");
        myList.add("double");
        myList.add("else");
        myList.add("extends");

        Iterator<String> iter = myList.iterator();
        while (iter.hasNext()) {
            System.out.println(iter.next());

        }

    }
}