package com.jesse.yourbmi;

import java.awt.HeadlessException;

public class BMI_Calculator {

    public static void main(String[] args) {


        System.out.println("Your Body Mass Index is " + DoYouKnowYourBMI(66, 1.79));
    }


    public static double DoYouKnowYourBMI (int mass, double height) {
        double BMI = mass/(height*height);

        if (BMI > 25) {
            System.out.println("You are overweight");
        } else if (BMI >= 18.5 && BMI <= 25) {
            System.out.println("Your weight is normal");
        } else if (BMI < 18.5) {
            System.out.println("You are underweight");
        }

        return BMI;
    }
}