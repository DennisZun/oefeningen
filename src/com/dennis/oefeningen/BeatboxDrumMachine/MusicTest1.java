package com.dennis.oefeningen.BeatboxDrumMachine;

import javax.sound.midi.*;

/**
 * Created by d on 6-2-2017.
 */
public class MusicTest1 {

    public void play() {
//        Sequencer sequencer = MidiSystem.getSequencer();

        System.out.println("We got a sequencer");
    }

    public static void main(String[] args) {
        MusicTest1 mt = new MusicTest1();
        mt.play();
    }


}
