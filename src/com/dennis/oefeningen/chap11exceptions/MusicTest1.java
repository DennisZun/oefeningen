package com.dennis.oefeningen.chap11exceptions;

import javax.sound.midi.*;

public class MusicTest1 {

    public void play() {
        try {
            Sequencer sequencer = MidiSystem.getSequencer();
            System.out.println("Succesfully got a sequencer");
        } catch (MidiUnavailableException e) {
            System.out.println("bummer");
        }
        System.out.println("We got a sequencer");
    }

    public static void main(String[] args) {
        MusicTest1 mt = new MusicTest1();
        mt.play();
    }
}
