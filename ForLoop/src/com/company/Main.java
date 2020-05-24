package com.company;

public class Main {

    public static void main(String[] args) {
        // Incrementing
        for(int i=2; i < 9; i++) {
            System.out.println("10000 at " + i + "% interest = " + String.format("%.2f",calculateInterest(10000.0, i)));
        }

        System.out.println("---------------------------------");
        // Decrementing
        for(int i=8; i > 1; i--) {
            System.out.println("10000 at " + i + "% interest = " + String.format("%.2f",calculateInterest(10000.0, i)));
        }

        System.out.println("---------------------------------");
        //Challenge
        int count = 0;
        for(int i=10; count<10; i++) { // This solution also works for checking the 'count'
            if(isPrime(i)) {
                count++;
                System.out.println(i + " is a prime number.");
//                if(count==3) {
//                    System.out.println("Exiting For Loop...");
//                    break;
//                }
            }
        }
    }

    public static boolean isPrime(int n) {
        if(n==1) {
            return false;
        }

        for(int i=2; i <= n/2; i++) {
            if(n % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static double calculateInterest(double amount, double interestRate) {
        return (amount * (interestRate/100));
    }
}
