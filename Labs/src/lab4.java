package src;
/* Author: Hia Al Saleh
 * Date: September 20th, 2024
 * File Name: lab4.java
 * 
 * Description:
 * Lab 4 (Convert Celsius to Fahrenheit)
 * (Convert Celsius to Fahrenheit) Write a program that reads a Celsius degree in
 * a double value from the console, then converts it to Fahrenheit and displays the
 * result. The formula for the conversion is as follows:
 * fahrenheit = (9 / 5) * celsius + 32
 * 
 * Purpose:
 * This program reads a Celsius degree from the user and converts it to Fahrenheit.
 * */
import java.util.Scanner;

public class lab4 {

    public static void main(String[] args) {
        // Scanner input
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a degree in Celsius: ");
        // Celsius
        double Celsius = input.nextDouble();
        // Fahrenheit
        double fahrenheit = (Celsius * 9 / 5) + 32;
        System.out.printf(Celsius + " Celsius is %.2f%n Fahrenheit", fahrenheit);
    }
}