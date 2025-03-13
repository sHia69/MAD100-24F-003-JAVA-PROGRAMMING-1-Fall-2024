package src;
/* Author: Hia Al Saleh
 * Date: October 4th, 2024
 * File: lab10.java
 * 
 * Description: 
 * Lab 10 (Heads or Tails)
 * (Simulation: heads or tails) Write a program that simulates flipping a coin one
 * million times and displays the number of heads and tails.
 * 
 * Purpose:
 * To practice using the Random class and generating random numbers.
 */
import java.util.Random;

public class lab10 {
    public static void main(String[] args) {
        int headsCount = 0, tailsCount = 0;
        Random random = new Random();

        for (int i = 0; i < 1000000; i++) {
            int flip = random.nextInt(2);
            if (flip == 0) {
                headsCount++;
            } else {
                tailsCount++;
            }
        }

        System.out.println("Number of Heads: " + headsCount);
        System.out.println("Number of Tails: " + tailsCount);
    }
}
