package com.javaex.problem03;

public class SoundApp {

    public static void main(String[] args) {
        printSound( new Cat() );
        printSound( new Dog() );
        printSound( new Sparrow() );
        printSound( new Duck() );
    }

    public static void printSound( Soundable soundable ) {
        //±¸Çö
    	System.out.println(soundable.sound());
    }
    
}
