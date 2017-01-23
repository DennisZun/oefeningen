package com.dennis.oefeningen.chap09;

/**
 * Created by d on 23-1-2017.
 */
public class GC {
    public static GC doStuff() {
        GC newGC = new GC();
        doStuff2(newGC);
        return newGC;
    }


    public static void main(String [] artgs) {
        GC gc1;
        GC gc2 = new GC();
        GC gc3 = new GC();
        GC gc4 = gc3;
        gc1 = doStuff();

        //line of test:
        gc1 = gc4;
        // call more methods
    }

    public static void doStuff2(GC copyGC) {
        GC localGC = copyGC; // see errata list on internet
    }
}
