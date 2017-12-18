package com.dennis.oefeningen.chap11exceptions;


public class TestExceptions {

    public static void main(String[] args) {

        String test = "yess";
        try {
            System.out.println("start try");
            doRisky(test);
            System.out.println("end try");

        } catch ( ScaryException se) {
            System.out.println("catching ScaryException");
            se.printStackTrace();
        } finally {
            System.out.println("finally");
        }
        System.out.println("after try catch finally");
    }

    static void doRisky(String test) throws ScaryException {
        System.out.println("start risky method");
        if ("yes".equals(test)) {
            throw new ScaryException();
        }
        System.out.println("end risky");
        return;
    }
}
