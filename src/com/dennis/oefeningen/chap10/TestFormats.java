package com.dennis.oefeningen.chap10;

import java.util.Calendar;
import java.util.Date;

public class TestFormats {

    public static void main(String[] args) {

        String a = String.format("i have %,d bugs to fix in %,d hours", 100000000, 87);
        String a1 = String.format("%c", 789);
        String b = String.format("I have %.2f, bugs to fix", 100000000.323233);
        String c = String.format("I have %,65.2f bugs to fix", 100000000.323233);
        String d = String.format("I have %f bugs to fix", 100.323233);
        Date today = new Date();
        String e = String.format("Vandaag is het %tA, %<td %<tB, %<tH uur en %<tM minuten en ik heb bugs to fix; in time zone %<tz", today);

        System.out.println(a);
        System.out.println(a1);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);

        Calendar cal = Calendar.getInstance();

        System.out.println("tijd is: "+ cal.getTimeInMillis() + " of " + cal.DAY_OF_MONTH);

        cal.set(1974, 7, 2,10,55);
        System.out.println("mijn verjaardag is: " + cal.getTime());
        cal.add(cal.DATE, 4);
        System.out.println("add 4 days " + cal.getTime());

        cal.add(cal.DATE, 35);
        System.out.println("add 35 days: " + cal.getTime());
        cal.roll(cal.DATE, 35);
        System.out.println("roll 35 days: " + cal.getTime());
        cal.set(cal.DATE, 1);
        System.out.println("set 1 days: " + cal.getTime());

    }
}
