package com.example.U1M4SummativeMHarinee.Model;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class Answer {

    private String question;
    private String answer;

    private static List<Answer> aList = new ArrayList<Answer>();

    public static List<Answer> getaList() {
        return aList;
    }

    public static void setaList(List<Answer> aList) {
        Answer.aList = aList;
    }

    public static Answer getRandomAnswer (String question) {
        Random rand = new Random();
        Answer anAnswer = getaList().get(rand.nextInt(getaList().size()));
        anAnswer.setQuestion(question);
        return anAnswer;
    }



    public Answer( String answer) {
        this.answer = answer;
        getaList().add(this);
    }


    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }
}
