package com.company;

public class Main {

    public static void main(String[] args) {
        int newScore = calculateScore("Caylem", 500);
        System.out.println("New score is: " + newScore);
        calculateScore(500);
        calculateScore();

        //Challenge Results
        double test = calcFeetAndInchesToCentimeters(3, 5);

        test = calcFeetAndInchesToCentimeters(100);
        test = calcFeetAndInchesToCentimeters(157);

    }
    // Method requiring Player name and score
    public static int calculateScore(String playerName, int score) {
        System.out.println("Player \'" + playerName + "\' scored " + score + " points." );
        return score * 1000;
    }
    // Method requiring score only
    public static int calculateScore(int score) {
        System.out.println("Unnamed Player scored " + score + " points.");
        return score * 1000;
    }
    // Method with no parameters
    public static int calculateScore() {
        System.out.println("No Player Name, and no Player score!" );
        return 0;
    }

    // Challenge
    public static double calcFeetAndInchesToCentimeters(double feet, double inches) {
        if ((feet < 0) || ((inches < 0) || (inches > 12))) {
            System.out.println("Invalid feet or inches parameters!");
            return -1;
        } else {
            double centimetres = (feet * 12) * 2.54;
            centimetres += inches * 2.54;
            System.out.println(feet + " feet, " + inches + " inches = " + centimetres + " cm");
            return centimetres;
        }
    }

    public static double calcFeetAndInchesToCentimeters(double inches) {
        if (inches < 0) {
            return -1;
        }

        double feet = (int)inches/12;
        double remainingInches = (int)inches%12;
        System.out.println(inches + " inches = " + feet + " feet and " + remainingInches + " inches");
        return calcFeetAndInchesToCentimeters(feet, remainingInches);
    }
}
