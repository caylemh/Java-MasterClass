package com.company;

public class Main {

    public static void main(String[] args) {
	    // Operators
        int result = 1+2; //1+2 = 3
        System.out.println("1 + 2 = " + result);
        int previousResult = result;
        System.out.println("previousResult = " + previousResult);
        result -= 1;
        System.out.println("3 - 1 = " + result);
        System.out.println("previousResult = " + previousResult);

        result *= 10; // 2 * 10 = 20
        System.out.println("2 * 10 = " + result);

        result /= 5; // 20 / 5 = 4
        System.out.println("20 / 5 = " + result);

        result %= 3; // 4 % 3 = remainder of 1
        System.out.println("4 % 3 = " + result);

        // Operator abbreviations:
        // result++, result--, result +=, result -=, result *=, etc.

        // Conditional Statements - if-then

        boolean isAlien = false;
        if (isAlien == false) {
            System.out.println("It is not an Alien!");
        }

        int topscore = 80;
        if (topscore < 100) {
            System.out.println("You've got the highest score!");
        }

        // Logical AND operator
        int secondTopscore = 95;
        if ((topscore > secondTopscore) && (topscore < 100)) {
            System.out.println("Greater than second top score and less than 100.");
        }

        // Logical OR operator
        if ((topscore > 90) || (secondTopscore <= 90)) {
            System.out.println("Either or both of the conditions are true.");
        }

        boolean isCar = false;
        if(isCar) {
            System.out.println("This is not supposed to happen.");
        }

        boolean wasCar = isCar ? true : false;
        if (wasCar) {
            System.out.println("wasCar is true");
        }

        // Operator Challenge
        double myVal1 = 20.00d;
        double myVal2 = 80.00d;

        double myResult = (myVal1 + myVal2) * 100.00d;
        System.out.println("myResult = " + myResult);
        double remainder = myResult % 40.00d;
        System.out.println("Remainder = " + remainder);
        boolean isNoRemainder = remainder == 0 ? true : false;
        System.out.println("isNoRemainder = " + isNoRemainder);

        if (!isNoRemainder) {
            System.out.println("Got some remainder!");
        }
    }
}
