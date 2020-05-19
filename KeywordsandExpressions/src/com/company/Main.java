package com.company;

public class Main {

    public static void main(String[] args) {
        // a mile is equal to 1.609344 kilometres
        double kilometres = (100 * 1.609344);
        int highscore = 50;

        if (highscore == 50) {
            System.out.println("This is an expression!");
        }


        // Challenge
        int score = 100;        // score = 100 are an expression
        if (score > 99) {       // score > 99 is an expressions
            System.out.println("You got the high score!");  // The literal string is an expression
            score = 0; //This is another expression
        }
    }
}
