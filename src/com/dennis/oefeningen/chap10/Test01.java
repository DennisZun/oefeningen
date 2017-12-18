package com.dennis.oefeningen.chap10;

import java.util.ArrayList;

public class Test01 {

    public static final int PROBEER;
    static {PROBEER =9;
        System.out.println("NOW THE CLASS IS LOADED");
    }

    public static void main (String [] args){
        System.out.println("hallo: "+ PROBEER );
//        probeer++;
        System.out.println("hallo2: "+ PROBEER );
//        System.out.println()


        int x = 32;
        ArrayList<Integer> list = new ArrayList<Integer>();
        System.out.println(list.size());
        list.add(x);
        System.out.println(list.size());
        list.add(new Integer(x));
//        list.add("testtekst");

        System.out.println(list.size());
        System.out.println(list.get(0));
//        System.out.println(list.get(2));
        int berekening = 4/2;
        System.out.println("berekening: "+ berekening );

        myFunc();

    }

    public static void myFunc() {

        double p = 1.0D;
        String str = "1.0D";
        try{
            p = Double.valueOf(str);
            return;
        }
        catch(Exception ex){
            System.out.println("Exception Happened");
//            return;  //return statement here!!!
        }finally{
            System.out.println("Finally");
        }
        System.out.println("After finally");
    }
}
