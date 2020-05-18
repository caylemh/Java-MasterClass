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

        // Byte, Short, Long and Width
        long myMinLongValue = Long.MIN_VALUE;
        long myMaxLongValue = Long.MAX_VALUE;
        System.out.println("Long Minimum Value: " + myMinLongValue);
        System.out.println("Long Maximum Value: " + myMaxLongValue);

        short myMinShortValue = Short.MIN_VALUE;
        short myMaxShortValue = Short.MAX_VALUE;
        System.out.println("Short Minimum Value: " + myMinShortValue);
        System.out.println("Short Maximum Value: " + myMaxShortValue);

        byte myMinByteValue = Byte.MIN_VALUE;
        byte myMaxByteValue = Byte.MAX_VALUE;
        System.out.println("Byte Minimum Value: " + myMinByteValue);
        System.out.println("Byte Maximum Value: " + myMaxByteValue);

        int myTotal =(myMinIntValue / 2);

        //Casting
        byte myNewByteValue = (byte)(myMinByteValue / 2);

        short myNewShortValue = (short)(myMinShortValue / 2);
    }
}
