package com.dennis.oefeningen.chap09;

/**
 * Created by d on 23-1-2017.
 */
class Bees {
    Honey[] beeHA;
}

class Raccoon {
    Kit k;
    Honey rh;
}

class Kit {
    Honey Kh;
}

class Bear {
    Honey hunny;
}

class Honey {
    public static void main(String[] args) {
        Honey honeyPot = new Honey();
        Honey [] ha = {honeyPot, honeyPot, honeyPot, honeyPot};
        Bees b1 = new Bees();
        b1.beeHA = ha;
        Bear [] ba = new Bear[5];
        for (int x=0;x<5;x++) {
            ba[x]= new Bear();
            ba[x].hunny = honeyPot;
        }
        Kit k = new Kit();
        k.Kh = honeyPot;
        Raccoon r = new Raccoon();

        r.rh = honeyPot;
        r.k = k;
        System.out.println("r.k.Kh = "+ r.k.Kh.getClass().getName());
        System.out.println("k.Kh = "+ k.Kh.getClass().getName());
        k = null;
        System.out.println("r.k.Kh = "+ r.k.Kh.getClass().getName());
        System.out.println("k.Kh = "+ k.Kh.getClass().getName());
    }
}