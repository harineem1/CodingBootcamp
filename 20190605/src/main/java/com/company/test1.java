package com.company;

public class test1 {
    public static void triplicate(String str) {
        String tagOut;
        int length = str.length();
        tagOut = str.substring(length - 2, length);
        System.out.println(tagOut + tagOut + tagOut);
    }

    public static String firstTwo(String str) {
        String tagOut;
        tagOut = str.substring(0,2);
        return tagOut;
    }
    public static String nonStart(String a, String b) {
        return(a.substring(1,a.length()) + b.substring(1,a.length()));
    }

    public static String firstHalf(String str) {
        return(str.substring(0,str.length()/2));
    }
    public static String withoutEnd(String str) {
        return(str.substring(1,str.length()-1));
    }
    public static String left2(String str) {
        String tagOut, leftPart, rightPart;
        leftPart = str.substring(0,2);
        rightPart = str.substring(2,str.length());
        tagOut = rightPart + leftPart;
        return tagOut;
    }
    public String right2(String str) {
        String tagOut, leftPart, rightPart;
        leftPart = str.substring(0,str.length()-2);
        rightPart = str.substring(str.length()-2,str.length());
        tagOut = rightPart + leftPart;
        return tagOut;
    }
    public static void main(String[] args) {
        //System.out.println(firstTwo("Hellooo"));
        //System.out.println(nonStart("a22", "nrrrr"));
        //System.out.println(firstHalf("123456"));
        System.out.println(withoutEnd("123456"));
    }
}
