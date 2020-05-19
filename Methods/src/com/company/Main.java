package com.company;

public class Main {

    public static void main(String[] args) {

        int highScore = calculateScore(true, 800, 5, 100);
        System.out.println("Your final score was " + highScore);

        highScore = calculateScore(true, 10000, 8, 200);
        System.out.println("Your final score was " + highScore + "\n");

        // Challenge Results
        int score = calculateHighScorePosition(1500);
        displayHighScorePosition("Gerald", score);

        int score1 = calculateHighScorePosition(1000);
        displayHighScorePosition("Steph", score1);

        int score2 = calculateHighScorePosition(900);
        displayHighScorePosition("Louis", score2);

        int score3 = calculateHighScorePosition(500);
        displayHighScorePosition("Amy", score3);

        int score4 = calculateHighScorePosition(400);
        displayHighScorePosition("Hope", score4);

        int score5 = calculateHighScorePosition(100);
        displayHighScorePosition("Sheldon", score5);

        int score6 = calculateHighScorePosition(50);
        displayHighScorePosition("Jeff", score6);
    }
    // Challenge Method1
    public static void displayHighScorePosition(String playerName, int position) {
        System.out.println(playerName + " managed to get into position " +
                position + " on the high score table.");
    }
    // Challenge Method2
    public static int calculateHighScorePosition(int playerScore) {
        int position = 4;
        if (playerScore >= 1000) {
            position = 1;
        } else if (playerScore >= 500) {
            position = 2;
        } else if (playerScore >= 100) {
            position = 3;
        }

        return position;
    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {

        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 2000;
            return finalScore;
        }

        return -1;

    }
}
