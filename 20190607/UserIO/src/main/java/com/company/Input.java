package com.company;

import com.company.interfaces.UserIO;

import java.security.PublicKey;
import java.util.Scanner;

//public int readInt(String prompt);
//public long readLong(String prompt);
//public double readDouble(String prompt);
//public float readFloat(String prompt);
//public String readString(String prompt);

public class Input implements UserIO {
    public Input(){

    }
    Scanner myScanner = new Scanner(System.in);

    public int readInt(String prompt){
        System.out.println(prompt);
        int i = Integer.parseInt(myScanner.nextLine());
        return i;
    }
    public long readLong(String prompt) {
        System.out.println(prompt);
        long l = Long.parseLong((myScanner.nextLine()));
        return l;
    }

    public double readDouble(String prompt){
        System.out.println(prompt);
        double d = Double.parseDouble((myScanner.nextLine()));
        return d;
     }
    public float readFloat(String prompt){
        System.out.println(prompt);
        float f = Float.parseFloat(myScanner.nextLine());
        return f;
    }
    public  String readString(String prompt) {
        System.out.println(prompt);
        String s = myScanner.nextLine();
        return s;
    }
}
