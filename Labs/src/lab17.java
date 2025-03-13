package src;
/* Author: Hia Al Saleh
 * Date: November 8th, 2024
 * File: lab17.java
 * 
 * Description:
 * Lab 17 - (Hangman)
 * (Game: hangman) Write a program that displays a word in asterisks and prompts the user to guess one letter at a time, as shown in the sample run. 
 * If the user guesses a letter that is in the word, the word is displayed. If the word is not displayed, a body part of the hangman is added. 
 * After a few misses, the game is over, and the word is displayed.
 * 
 * Purpose:
 * Using arrays and loops to practice programming.
 */
import java.util.Scanner;

public class lab17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String hangman;
        final int TOTAL_MAX_MISSES = 7; // Total number of misses allowed in the game

        // do-while loop to play the game
        do {
            char[] word = getWord();
            char[] asterisks = new char[word.length];
            asterisks(asterisks);

            int missed = 0;
            while (!isComplete(asterisks) && missed < TOTAL_MAX_MISSES) {
                char guess = getGuess(asterisks);
                if (!isCorrectGuess(word, asterisks, guess)) {
                    missed++;
                }
            }

            printResult(word, missed);
            if (missed >= TOTAL_MAX_MISSES) {
                System.out.println("You've reached the maximum number of misses.");
            }
            System.out.println("Do you want to guess another word? Enter y or n>");
            hangman = input.next();
        } while (hangman.charAt(0) == 'y');
        System.out.println("Thanks for playing Hangman, have a great day!");
    }

    // Method to get a guess from the user
    public static char getGuess(char[] asterisks) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Hangman game!");
        System.out.print("(Guess) Enter a letter in word ");
        System.out.print(asterisks);
        System.out.print(" > ");
        return input.next().charAt(0);
    }

    // Method to get a random word from the list
    public static char[] getWord() {
        String[] words = { "write", "that", "program", "is", "fun" };
        return words[(int) (Math.random() * words.length)].toCharArray();
    }

    // Method to replace the word with asterisks
    public static void asterisks(char[] list) {
        for (int i = 0; i < list.length; i++) {
            list[i] = '*';
        }
    }

    // Method to check if the guess is correct
    public static boolean isCorrectGuess(char[] word, char[] asterisks, char guess) {
        boolean correct = false;
        for (int i = 0; i < word.length; i++) {
            if (word[i] == guess) {
                if (asterisks[i] != guess) {
                    asterisks[i] = guess;
                    correct = true;
                } else {
                    System.out.println("\t" + guess + " is already in the word");
                    return true;
                }
            }
        }
        if (!correct) {
            System.out.println("\t" + guess + " is not in the word");
        }
        return correct;
    }

    // Method to check if the word is complete
    public static boolean isComplete(char[] asterisks) {
        for (char i : asterisks) {
            if (i == '*') {
                return false;
            }
        }
        return true;
    }

    // Method to print the result
    public static void printResult(char[] word, int missed) {
        System.out.print("The word is ");
        System.out.println(word);
        System.out.println("You missed " + missed + " time(s)");
    }

}