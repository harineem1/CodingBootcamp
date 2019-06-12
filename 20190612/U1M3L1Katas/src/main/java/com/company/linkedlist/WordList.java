package com.company.linkedlist;
import java.util.LinkedList;
import java.util.Arrays;
import java.util.Iterator;

public class WordList {

    public static void main(String[] args) {

        String[] wordList = {"byte", "case", "catch", "class", "const", "continue", "do", "double", "else", "extends"};


        // convert array to LinkedList
        LinkedList ll = new LinkedList(Arrays.asList(wordList));

        // iterate over each element in LinkedList and show what is in the list.
        Iterator iterator = ll.iterator();
        while (iterator.hasNext()) {
            // Print element to console
            System.out.println((String) iterator.next());

        }
    }
}