package src;
/* Author: Hia Al Saleh
 * Date: December 5th, 2024
 * File: lab21.java
 * 
 * Description:
 * Lab 21 (Sum ArrayList)
 * (Sum ArrayList) Write the following method that returns the sum of all numbers in an ArrayList:
    public static double sum(ArrayList<Double> list)
    Write a test program that prompts the user to enter five numbers, stores them in an array list, and displays their sum
 *
 * Purpose:
 * To practice using ArrayLists and methods.
 */
import java.util.ArrayList;
import java.util.Scanner;

public class lab21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Double[] numbers = new Double[5];
        System.out.print("Enter five numbers: ");
        for (int i = 0; i < 5; i++) {
            numbers[i] = input.nextDouble();
        }
        ArrayList<Double> list = new ArrayList<>(java.util.Arrays.asList(numbers));
        System.out.println("Sum of the numbers: " + sum(list));
    }

    public static double sum(ArrayList<Double> list) {
        double sum = 0;
        for (double i : list) {
            sum += i;
        }
        return sum;
    }
}