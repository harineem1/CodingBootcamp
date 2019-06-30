package com.example.U1M4SummativeMHarinee.Model;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Definition {

    private String word;

    private String definition;

    private static List<Definition> dList = new ArrayList<Definition>();


    public static Definition getRandomDefinition () {
        Random rand = new Random();
        return getdList().get(rand.nextInt(getdList().size()));
    }


    public Definition(String word, String definition) {
        this.word = word;
        this.definition = definition;
        getdList().add(this);
    }

    public static List<Definition> getdList() {
        return dList;
    }

    public static void setdList(List<Definition> dList) {
        Definition.dList = dList;
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public String getDefinition() {
        return definition;
    }

    public void setDefinition(String definition) {
        this.definition = definition;
    }
}
