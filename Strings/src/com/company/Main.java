package com.company;

public class Main {

    public static void main(String[] args) {
	    // byte
        // short
        // int
        // long
        // float
        // double
        // char
        // boolean

        String myString = "\'This is a string\'";
        System.out.println("myString is equal to " + myString);
        myString += ", and this more.";
        System.out.println("myString is equal to " + myString);
        myString += " \u00A9 2019";
        System.out.println("myString is equal to " + myString);
        String numberString = "250.55";
        numberString += "49.95";
        System.out.println(numberString);
        String lastString = "10";
        int myInt = 50;
        lastString += myInt;
        System.out.println("LastString = " + lastString);
        double doubleNumber = 120.47d;
        lastString += doubleNumber;
        System.out.println("LastString = " + lastString);
    }
}
