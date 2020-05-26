package com.company;

public class Main {

    public static void main(String[] args) {
	    String numberAsString = "2018.125";
        System.out.println("numberAsString = " + numberAsString);
        // Convert the string to a number
        double number = Double.parseDouble(numberAsString);
        // Testing the new number
        numberAsString += 10;
        number += 10;

        System.out.println("numberAsString = " + numberAsString);
        System.out.println("number = " + number);
    }
}
