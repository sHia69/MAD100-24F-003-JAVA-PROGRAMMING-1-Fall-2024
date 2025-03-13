package src;
/* Author: Hia Al Saleh
 * Date: October 4th, 2024
 * File: lab9.java
 * 
 * Description:
 * Lab 9 - (Pick A Card)
 * (Game: pick a card) Write a program that simulates picking a card from a deck
 * of 52 cards. Your program should display the rank (Ace, 2, 3, 4, 5, 6, 7, 8, 9, 10,
 * Jack, Queen, King) and suit (Clubs, Diamonds, Hearts, Spades) of the card.
 * 
 * Purpose:
 * To simulate picking a card from a deck of 52 cards and display the rank and suit of the card.
 */
/*

*/
public class lab9 {
	public static void main(String[] args) {
		// Generate a random integer 1 - 13
		int rank = (int) ((Math.random() * (14 - 1)) + 1);

		// Generate a random integer 1 - 4
		int suit = (int) (Math.random() * 4);

		// Display card picked from deck
		System.out.print("The card you picked is ");
		switch (rank) // Get rank
		{
			case 1:
				System.out.print("Ace");
				break;
			case 2:
				System.out.print(rank);
				break;
			case 3:
				System.out.print(rank);
				break;
			case 4:
				System.out.print(rank);
				break;
			case 5:
				System.out.print(rank);
				break;
			case 6:
				System.out.print(rank);
				break;
			case 7:
				System.out.print(rank);
				break;
			case 8:
				System.out.print(rank);
				break;
			case 9:
				System.out.print(rank);
				break;
			case 10:
				System.out.print(rank);
				break;
			case 11:
				System.out.print("Jack");
				break;
			case 12:
				System.out.print("Queen");
				break;
			case 13:
				System.out.print("King");
		}
		System.out.print(" of ");
		switch (suit) // Get suit
		{
			case 0:
				System.out.println("Clubs");
				break;
			case 1:
				System.out.println("Diamonds");
				break;
			case 2:
				System.out.println("Hearts");
				break;
			case 3:
				System.out.println("Spades");
		}
	}
}
/*  
import java.util.Scanner;

public class lab9{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] ranks = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};
        String[] suits = {"Clubs", "Diamonds", "Hearts", "Spades"};

        System.out.print("Enter a number between 0 and 12 for rank: ");
        int rank = input.nextInt();

        System.out.print("Enter a number between 0 and 3 for suit: ");
        int suit = input.nextInt();

        if (rank >= 0) {
            if (rank <= 12) {
                if (suit >= 0) {
                    if (suit <= 3) {
                        System.out.println("The card you picked is " + ranks[rank] + " of " + suits[suit]);
                    } else {
                        System.out.println("Invalid input for suit. Please enter a number between 0 and 3.");
                    }
                } else {
                    System.out.println("Invalid input for suit. Please enter a number between 0 and 3.");
                }
            } else {
                System.out.println("Invalid input for rank. Please enter a number between 0 and 12.");
            }
        } else {
            System.out.println("Invalid input for rank. Please enter a number between 0 and 12.");
        }
    }
}
*/