package com.dennis.oefeningen.BeatboxDrumMachine;


import javax.sound.midi.*;
import java.io.FileNotFoundException;


public class MusicTest1 {

    public void play(){
        try {
            Sequencer sequencer = MidiSystem.getSequencer();
            System.out.println("We got a sequencer");
        } catch (MidiUnavailableException ex){
            System.out.println("Bummer");
        }

    }

    public static void main(String[] args) {
        MusicTest1 mt = new MusicTest1();
        mt.play();
    }
}