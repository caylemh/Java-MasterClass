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
    }
}
