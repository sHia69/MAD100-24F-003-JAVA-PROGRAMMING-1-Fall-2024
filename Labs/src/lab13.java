package src;
/* Author: Hia Al Saleh
 * Date: October 18th, 2024
 * File: lab13.java
 * 
 * Description:
 * Lab 13 - (Display Pattern Function)
 * (Display patterns) Write a method to display a pattern as follows:

                  1
                2 1
              3 2 1
    ...
    n n-1 ... 3 2 1

* The method header is

* public static void displayPattern(int n)
*
* Purpose:
* The purpose of this program is to display a pattern of numbers in a pyramid shape.
*/

public class lab13 {
    public static void displayPattern(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = i; j >= 1; j--) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        displayPattern(5); 
    }
}