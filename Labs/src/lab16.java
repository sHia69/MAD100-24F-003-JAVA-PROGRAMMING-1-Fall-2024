package src;
/* Author: Hia Al Saleh
 * Date: October 25th, 2024
 * File: lab16.java
 * 
 * Description:
 * Lab 16 - (Print Distinct Integers)
 * (Print distinct numbers) Write a program that reads in ten numbers and displays
 * the number of distinct numbers and the distinct numbers separated by exactly one
 * space (i.e., if a number appears multiple times, it is displayed only once). (Hint:
 * Read a number and store it to an array if it is new. If the number is already in the
 * array, ignore it.) After the input, the array contains the distinct numbers.
 * 
 * Purpose: 
 * Using arrays and loops to practice programming.
 */
import java.util.Scanner;

public class lab16 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] distinctNumbers = new int[10]; 
        int count = 0; 
        System.out.println("Enter 10 numbers:");

        for (int i = 0; i < 10; i++) {
            int num = input.nextInt();

            if (isNew(distinctNumbers, count, num)) {
                distinctNumbers[count] = num;
                count++; 
            }
        }

        System.out.println("The number of distinct numbers is " + count);
        System.out.print("The distinct numbers are: ");
        for (int i = 0; i < count; i++) {
            System.out.print(distinctNumbers[i] + " ");
        }
    }

    public static boolean isNew(int[] array, int length, int num) {
        for (int i = 0; i < length; i++) {
            if (array[i] == num) {
                return false; 
            }
        }
        return true;
    }
}