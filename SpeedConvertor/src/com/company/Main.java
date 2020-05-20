package com.company;

public class Main {

    public static void main(String[] args) {
        long miles = SpeedConvertor.toMilesPerHour(15);

        System.out.println("Miles = " + miles);
        SpeedConvertor.printConversion(miles);
    }
}
