package src;
/* Author: Hia Al Saleh
 * Date: October 25th, 2024
 * File: lab15.java
 * 
 * Description:
 * (Count single digits) Write a program that generates 100 random integers between 
 * 0 and 9 and displays the count for each number. (Hint: Use an array of ten       
 * integers, say counts, to store the counts for the number of 0s, 1s, . . . , 9s.)
 * 
 * Purpose:
 * To practice using arrays and loops. 
 */
import java.util.Random;

public class lab15 {
    // Main method
    public static void main(String[] args) {
        int[] counts = new int[10];  
        Random rand = new Random(); 
        // Creates 100 random integers between 0 and 9
        for (int i = 0; i < 100; i++) {
            int randomNumber = rand.nextInt(10);
            counts[randomNumber]++; 
        }
        // Display the count for each number
        for (int i = 0; i < counts.length; i++) {
            System.out.println("Digit " + i + ": " + counts[i]);
        }
    }
}