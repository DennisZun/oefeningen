package com.dennis.oefeningen.chap11exceptions;

import java.net.SocketPermission;

/**
 * Created by d on 6-2-2017.
 */
public class TestExceptions {

    public static void main(String[] args) throws ScaryException {

        String test = "yes";
        //try {
            System.out.println("start try");
            //Thread.sleep(4000);
            doRisky(test);
            System.out.println("end try");

        //}/
        /*catch (ScaryException se) {
            System.out.println("scary exceptiondz");
            se.printStackTrace();


        }finally {
            System.out.println("finallydz");
        }*/
        System.out.println("end of maindz");

    }

    static void doRisky(String test) throws ScaryException {
        System.out.println("start risky");
        if ("yes".equals(test)) {
            throw new ScaryException();
        }
        System.out.println("end risky");
        return;

    }

}
