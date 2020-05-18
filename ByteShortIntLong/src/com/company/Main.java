package com.company;

public class Main {

    public static void main(String[] args) {

        int myValue = 10000;

        int myMinIntValue = Integer.MIN_VALUE;
        int myMaxIntValue = Integer.MAX_VALUE;

        System.out.println("Integer Minimum Value: " + myMinIntValue);
        System.out.println("Integer Maximum Value: " + myMaxIntValue);

        //Underflow and Overflow concepts, very bad practice.
        System.out.println("Busted Max Value: " + (myMaxIntValue + 1));
        System.out.println("Busted Min Value: " + (myMinIntValue - 1));

        // Testing values
        // int myMaxIntTest = 2_147_483_648;        Value is too large
        int myMaxIntTest = 2_147_483_647;
        System.out.println(myMaxIntTest);
    }
}
