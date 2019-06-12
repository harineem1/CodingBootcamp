package com.company;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ClassMate {

    private String name;
    private String haircolor;

    public ClassMate() {
    }

    public ClassMate(String name, String haircolor) {
        this.name = name;
        this.haircolor = haircolor;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHaircolor() {
        return haircolor;
    }

    public void setHaircolor(String haircolor) {
        this.haircolor = haircolor;
    }

    //class ClassMateArrayList {
    public static void main(String[] args) {

        List<ClassMate> myClassmate = new ArrayList<ClassMate>();

        ClassMate c1 = new ClassMate("Joe", "black");
        ClassMate c2 = new ClassMate("Jane", "brown");
        ClassMate c3 = new ClassMate("Bill", "Burgandy");
        ClassMate c4 = new ClassMate("Tom", "Blue");
        ClassMate c5 = new ClassMate("Marco", "lightbrown");


        myClassmate.add(c1);
        myClassmate.add(c2);
        myClassmate.add(c3);
        myClassmate.add(c4);
        myClassmate.add(c5);

        for  (ClassMate temp :myClassmate ) {
            System.out.println("Name: " +temp.getName() +"     Hair color:" + temp.getHaircolor());
        }
    }
}



