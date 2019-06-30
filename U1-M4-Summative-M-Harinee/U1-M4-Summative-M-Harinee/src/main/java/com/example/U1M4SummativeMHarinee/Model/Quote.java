package com.example.U1M4SummativeMHarinee.Model;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Quote {
    private String author;
    private String quote;

    private static List<Quote> qList = new ArrayList<Quote>();

    public static List<Quote> getqList() {
        return qList;
    }

    public static void setqList(List<Quote> qList) {
        Quote.qList = qList;
    }


    public Quote(String author, String quote) {
        this.author = author;
        this.quote = quote;
        getqList().add(this);
    }

    public Quote() {
    }

    /*public String getAText() {
        return "aTcccccext";
    }

    public String getQuoteString() {
        return (this.getAuthor() + " + " + this.getQuote());
    }*/

    public static Quote getSpecificQuote(int anInt) {
        return getqList().get(anInt);
    }

    public static Quote getRandomQuote() {
        Random rnd = new Random();
        return getqList().get(rnd.nextInt(getqList().size()));
    }


    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getQuote() {
        return quote;
    }

    public void setQuote(String quote) {
        this.quote = quote;
    }
}