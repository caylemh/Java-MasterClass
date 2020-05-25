package com.company;

public class Main {

    public static void main(String[] args) {
//        int count=1;
//        while (count != 6) {
//            System.out.println("Count value is: " + count);
//            count++;
//        }

        // Alternative While Loop
//        count = 1;
//        while (true) {
//            if(count == 6) {
//                break;
//            }
//            System.out.println("Count value is: "+ count);
//            count++;
//        }
//
//        // Do-While Loop
//        count=1;
//        do {
//            System.out.println("Count value is: " + count);
//            count++;
//        } while (count != 6);

        int num = 1;
        int finNumber = 20;
        int count = 0;

        while(num <= finNumber) {
            num++;
            if(!isEvenNumber(num)) {
                continue;
            }
            System.out.println("Even number " + num);
            count++;
            if(count == 5) {
                System.out.println("Total number of Even numbers found: " + count);
                break;
            }

        }
    }

    public static boolean isEvenNumber(int n) {
            if(n%2 == 0) {
                 return true;
            } else {
                return false;
            }
    }
}
