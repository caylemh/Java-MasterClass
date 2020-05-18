package com.company;

public class Main {

    public static void main(String[] args) {
        // Primitive Types Challenge
        byte myByteValue = 120;
        short myShortValue = 5000;
        int myIntValue = 60000;
        long myLongValue = 50000L + (10L * (myByteValue + myShortValue + myIntValue));

        System.out.println("myLongValue = " + myLongValue);
    }
}
