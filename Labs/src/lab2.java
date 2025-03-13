package src;
/*
 * Author: Hia Al Saleh
 * Date: September 6th, 2024
 * File Name: lab2.java
 * 
 * Lab 2 - Display Average
 * A program that contain three variables name firstNum, secondNum and thirdNum
 * Create another variable named average
 * Calculate and store the average of firstNum, secondNum and thirdNum
 * Output the average to the screen
 * 
 * Purpose: 
 * This program contains three variables named firstNum, secondNum, and thirdNum.
 * It calculates the average of these three numbers and outputs the result to the screen.
 */

public class lab2 {
    public static void main(String[] args) {
        // Declare three variables
        int firstNum = 2;
        int secondNum = 4;
        int thirdNum = 6;
        // Calculate the average of the three numbers
        double average = (firstNum+secondNum+thirdNum)/3;
        System.out.println(average); // Output the average to the screen
    }
}
