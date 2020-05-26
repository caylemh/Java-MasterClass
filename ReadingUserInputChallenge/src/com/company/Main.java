package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);

        int count = 1, sum = 0;
        ArrayList<Integer> numbers = new ArrayList<Integer>();

        while(count <= 10) {
            System.out.println("Enter number #" + count + ": ");

            boolean hasNextInt = scanner.hasNextInt();

            if(hasNextInt) {

                // User Enters a number
                int number = scanner.nextInt();
                numbers.add(number);
                sum += number;
                count++;

            } else {
                System.out.println("Invalid number!");
            }

            scanner.nextLine(); // handle end of line (enter key)
        }
        System.out.println("Sum of: " + numbers + " = " + sum);
        scanner.close();
    }
}
