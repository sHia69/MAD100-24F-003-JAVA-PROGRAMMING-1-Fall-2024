package src;
/* Author: Hia Al Saleh
 * Date: September 27th, 2024
 * File: lab8.java
 * 
 * Description: 
 * Lab 8 - (Calculate Area)
 * Write a program that calculates the area of a circle, square, or rectangle based on user input.
 * 
 * Purpose:
 * To calculate the area of a circle, square, or rectangle based on user input.
 */

import java.util.Scanner;

public class lab8 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int choice;
        double area;
        System.out.println("Welcome to the Calculate Area software!");
        System.out.println("What would you like to calculate the area of? \n" +
                            "1) Circle\n" +
                            "2) Square\n" +
                            "3) Rectangle\n" +
                            "Enter a number (1-3): ");
        choice = input.nextInt();
        switch (choice) {
            case 1:
                System.out.print("Please enter the radius of the circle: ");
                double radius = input.nextDouble();
                
                if (radius > 0) {
                    area = 3.14 * radius * radius; 
                    System.out.println("The area of a circle with radius " + radius + " is " + area);
                } else {
                    System.out.println("Error - Radius must be greater than zero.");
                }
                break;
            case 2:
                System.out.print("Please enter the side length of the square: ");
                double side = input.nextDouble();
                
                if (side > 0) {
                    area = Math.pow(side, 2);
                    System.out.println("The area of a square with side length " + side + " is " + area);
                } else {
                    System.out.println("Error - Side length must be greater than zero.");
                }
                break;
            case 3:
                System.out.print("Please enter the length of the rectangle: ");
                double length = input.nextDouble();
                System.out.print("Please enter the width of the rectangle: ");
                double width = input.nextDouble();
                
                if (length > 0 && width > 0) {
                    area = length * width;
                    System.out.println("The area of a rectangle with length " + length + " and width " + width + " is " + area);
                } else {
                    System.out.println("Erro - Length and width must be greater than zero.");
                }
                break;
            default:
                System.out.println("Error, please select 1, 2, or 3.");
                break;
        }
    }
}
