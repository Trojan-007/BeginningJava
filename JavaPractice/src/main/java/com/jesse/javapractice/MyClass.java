package com.jesse.javapractice;

public class MyClass {

    public static void main(String[] args) {

       int change = getMilk(5, 70);
       System.out.println("Hello Master, your change is " + change + " Naira");
    }

//    public static void getMilk () {
//
//        System.out.println("Open the door");
//        System.out.println("Walk to the store");
//        System.out.println("Buy milk on the ground floor");
//        System.out.println("Return home with milk galore");
//
//    }

//    public static void getMilk (int numOfCartonsToBuy) {
//
//        int priceToPay = numOfCartonsToBuy * 10;
//
//        System.out.println("Open the door");
//        System.out.println("Walk to the store");
//        System.out.println("Buy " + numOfCartonsToBuy + " cartons on the ground floor");
//        System.out.println("Pay " + priceToPay + " Naira, and nothing more");
//        System.out.println("Return home with milk galore");


    public static int getMilk (int numOfCartonsToBuy, int startingAmount) {

        int priceToPay = numOfCartonsToBuy * 10;

        System.out.println("Open the door");
        System.out.println("Walk to the store");
        System.out.println("Buy " + numOfCartonsToBuy + " cartons on the ground floor");
        System.out.println("Pay " + priceToPay + " Naira, and nothing more");
        System.out.println("Return home with milk galore");

        return startingAmount - priceToPay;


    }
}