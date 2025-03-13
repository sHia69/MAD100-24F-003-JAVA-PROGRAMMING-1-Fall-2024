package src;
/* Author: Hia Al Saleh
 * Date: September 20th, 2024
 * File Name: lab5.java
 * 
 * Description:
 * Lab 5 (Compute Volume of a Cylinder)
 * (Compute the volume of a cylinder) Write a program that reads in the radius
 * and length of a cylinder and computes the area and volume using the following
 * formulas:
 * area = radius * radius * pi
 * volume = area * length
 * 
 * Purpose:
 * To calculate the area and volume of a cylinder given the radius and length.
 * */
import java.util.Scanner;

public class lab5 {
    public static void main(String[] args) {
        // Declare variables
        double area;
        double volume;
        double radius, length;
        // Create a scanner object
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the radius and length of a cylinder: ");
        radius = input.nextDouble();
        length = input.nextDouble();
        // Calculate the area and volume
        area = Math.PI * radius * radius;
        System.out.println("The area is " + area);
        // volume = area * length;
        volume = area * length;
        System.out.println("The volume is " + volume);
    }
}
