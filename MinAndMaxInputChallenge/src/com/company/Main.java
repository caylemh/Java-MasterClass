package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);

	    int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;

	    while(true) {
            System.out.println("Enter a number: ");

            boolean hasNextInt = scanner.hasNextInt();

            if(hasNextInt) {
                int number = scanner.nextInt();
                // Set max number
                if(number > max) {
                    max = number;
                }
                // Set min number
                if(number < min) {
                    min = number;
                }

            } else {
                System.out.println("Invalid Number!");
                break;
            }
            scanner.nextLine();
        }
        System.out.println("The Minimum number entered: " + min);
        System.out.println("The Maximum number entered: " + max);
	    scanner.close();
    }
}
