package src;
/* Author: Hia Al Saleh
 * Date: October 18th, 2024
 * File: lab13.java
 * 
 * Description:
 * Lab 14 - (Craps Game)
 * (Game: craps) Craps is a popular dice game played in casinos. Write a program to play a variation of the game, as follows:
 * Roll two dice. Each die has six faces representing values 1, 2, …, and 6, respectively.
 * Check the sum of the two dice. If the sum is 2, 3, or 12 (called craps), you
 * lose; if the sum is 7 or 11 (called natural), you win; if the sum is another value
 * (i.e., 4, 5, 6, 8, 9, or 10), a point is established. Continue to roll the dice until either
 * a 7 or the same point value is rolled. If 7 is rolled, you lose. Otherwise, you win.
 * Your program acts as a single player.
 * 
 * Purpose:
 * The purpose of this program is to simulate a game of craps.
 */
import java.util.Random;

public class lab14 {

    public static void main(String[] args) {
        Random rand = new Random();
        System.out.println("Welcome to Craps Game!");
        int rollDice = roll(rand);
        int result = checkResult(rollDice);

        if (isWin(result)) {
            gameResult(1);
        } else if (isLose(result)) {
            gameResult(0);
        } else {
            keepRolling(result, rand);
        }
    }

    public static int rollDie(Random rand) {
        return rand.nextInt(6) + 1;
    }

    public static int roll(Random rand) {
        int die1 = rollDie(rand);
        int die2 = rollDie(rand);
        int rollSum = die1 + die2;
        System.out.println("You rolled " + die1 + " + " + die2 + " = " + rollSum);
        return rollSum;
    }

    public static int checkResult(int rollSum) {
        switch (rollSum) {
            case 2:
            case 3:
            case 12:
                return 0;
            case 7:
            case 11:
                return 1;
            default:
                return rollSum;
        }
    }

    public static void gameResult(int result) {
        if (result == 0) {
            System.out.println("You lose");
        } else if (result == 1) {
            System.out.println("You win");
        }
    }

    public static boolean isWin(int result) {
        return result == 1;
    }

    public static boolean isLose(int result) {
        return result == 0;
    }

    public static void keepRolling(int point, Random rand) {
        int result;
        boolean continueRolling = true;

        do {
            result = roll(rand);
            if (result == point) {
                continueRolling = false;
            }

            if (result == 7) {
                continueRolling = false;
            }

        } while (continueRolling);
        if (result == 7) {
            gameResult(0);
        } else {
            gameResult(1);
        }
    }
}