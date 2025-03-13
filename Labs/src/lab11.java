package src;
/* Author: Hia Al Saleh
 * Date: October 4th, 2024
 * File: lab11.java
 * 
 * Description:
 * Lab 11 - (Rock Paper Sissors Advanced)
 * Write a program that lets the user play the game of Rock, Paper, Scissors against the computer.
 * 
 * Purpose:
 * To practice using loops and conditional statements.
 */

import java.util.Scanner;

public class lab11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int userWins = 0, computerWins = 0;
        int userChoice;
        boolean continuePlaying;


        do {
            int computerChoice = (int) (Math.random() * 3);
            System.out.print("Scissor (0), Rock (1), Paper (2): ");
            userChoice = input.nextInt();

            switch (userChoice) {
                case 1:
                    System.out.println(" You are Scissor");
                    break;
                case 2:
                    System.out.println("You are Rock");
                    break;
                case 3:
                    System.out.println("You are Paper");
            }

            switch (computerChoice){
                case 1:
                    System.out.println("Computer is Scissor");
                    break;
                case 2:
                    System.out.println("Computer is Rock");
                    break;
                case 3:
                    System.out.println("Computer is Paper");
            }
            if (computerChoice == userChoice) {
                System.out.println("It is a draw.");
            } else if ((userChoice - computerChoice + 3) % 3 == 1) {
                System.out.println("You won!");
                userWins++;
            } else {
                System.out.println("You lost.");
                computerWins++;
            }

            System.out.println("Score: You (" + userWins + "), Computer (" + computerWins + ")");

            if (userWins >= computerWins + 2) {
                continuePlaying=false;
            } else if (computerWins >= userWins + 2) {
                continuePlaying=false;
            }
            else {
                continuePlaying=true;
            }

        } while (continuePlaying);



        if (userWins >= computerWins + 2) {
            System.out.println("You win the game!");
        } else if (computerWins >= userWins + 2) {
            System.out.println("The computer wins the game!");
        }

        System.out.println("Final Score: \nYou: " + userWins + " \nComputer: " + computerWins);
    }
}
