package src;
/* Author: Hia Al Saleh
 * Date: October 18th, 2024
 * File: lab12.java
 * 
 * Description:
 * Lab 12 (Conversion Assignments Functions)
 * (Conversions between Celsius and Fahrenheit) Write a class that contains the following two methods:
 * Convert from Celsius to Fahrenheit
 * public static double celsiusToFahrenheit(double celsius)
 * Convert from Fahrenheit to Celsius 
 * public static double fahrenheitToCelsius(double fahrenheit)
 * The formula for the conversion is:
 * fahrenheit = (9.0 / 5) * celsius + 32
 * celsius = (5.0 / 9) * (fahrenheit – 32)
 * 
 * Purpose:
 * The purpose of this program is to convert Celsius to Fahrenheit and Fahrenheit to Celsius using two methods.
*/
public class lab12 {
    public static void main(String[] args) {
        System.out.println("Celsius  Fahrenheit   |  Fahrenheit  Celsius");
        System.out.println("--------------------------------------------");

        double celsius = 40.0;
        double fahrenheit = 120.0;

        while (celsius >= 31.0) {
            double fahrenheitResult = celsiusToFahrenheit(celsius);
            double celsiusResult = fahrenheitToCelsius(fahrenheit);

            System.out.printf("%-8.1f %-12.1f |  %-11.1f %.2f%n", celsius, fahrenheitResult, fahrenheit, celsiusResult);

            celsius--;
            fahrenheit -= 10;
        }
    }

    /** Convert from Celsius to Fahrenheit */
    public static double celsiusToFahrenheit(double celsius) {
        return (9.0 / 5) * celsius + 32;
    }

    /** Convert from Fahrenheit to Celsius */
    public static double fahrenheitToCelsius(double fahrenheit) {
        return (5.0 / 9) * (fahrenheit - 32);
    }
}

/*
 * %-8.1f means the Celsius value is shown with 1 number after the decimal point and takes up 8 spaces, aligned to the left.
 * %-12.1f does the same for the Fahrenheit value, making sure the columns line up nicely.
 * %.2f shows the Celsius values from the second conversion with 2 numbers after the decimal point.
 */
