package src;
/* Author: Hia Al Saleh
 * Date: September 20th, 2024
 * File Name: lab6.java
 * 
 * Description:
 * Lab 6 (Sum the digits in an Integer)
 * (Sum the digits in an integer) Write a program that reads an integer between 0 and
 * 1000 and adds all the digits in the integer. For example, if an integer is 932, the
 * sum of all its digits is 14.
 * Hint: Use the % operator to extract digits, and use the / operator to remove the
 * extracted digit. For instance, 932 % 10 = 2 and 932 / 10 = 93.
 * 
 * Purpose:
 * To calculate the area and volume of a cylinder given the radius and length.
 * */
import java.util.Scanner;

public class lab6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number between 0 and 1000:\n ");
        int num = input.nextInt();
        if (num < 0) {
            System.out.println("The number must be between 0 and 1000.");
        }
        else if (num > 1000) {
            System.out.println("The number must be between 0 and 1000.");
        }
        else {
            int result = num % 10 + (num / 10) % 10 + (num / 100) % 10;
            System.out.println("The sum of the digits is " + result);
        }
    }
}
