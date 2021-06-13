package com.jesse.couldthisbelove;

import java.util.Random;

public class LoveCalculator {

    public static void main(String[] args) {

//        int loveScore = ifYouHadMyLove("Miss X", "Mr Y");

        System.out.println("Your love score is " + ifYouHadMyLove("Rachael", "Jesse"));

    }

    public static int ifYouHadMyLove(String yourName, String myName) {

        Random randObject = new Random();
        int loveScore = randObject.nextInt(101);

        if (loveScore > 80) {
            System.out.println(yourName + " and " + myName + ", you love each other like Romeo and Juliet");
        } else if (loveScore > 40) {
            System.out.println(yourName + " and " + myName + ", you go together like coke and menthos");
        } else {
            System.out.println ("No love possible, you'll be forever alone");
        }

        return  loveScore;
    }
}