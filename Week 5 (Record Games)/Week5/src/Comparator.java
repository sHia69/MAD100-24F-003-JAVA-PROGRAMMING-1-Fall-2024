import java.util.Scanner;

public class Comparator {
    public static void main(String[] args) {
        //Take in two numbers
        // Run the three comparisons
        // Output which are true and false
        Scanner input = new Scanner(System.in);
        System.out.println("This program will compare 2 numbers to each other and output the follow:\n" +
                "1) Is the first number greater  than the second\n" +
                "2) Is the first number less than the second\n" +
                "3) Is the first number equal to the second\n");
        System.out.println("Please input the first number");
        double num1 = input.nextDouble();
        System.out.println("Please input the second number");
        double num2 = input.nextDouble();

        double smallest = min(num1, num2);
        System.out.println("Smallest: " + smallest);
        double largest = min(num1, num2);
        System.out.println("Largest: " + largest);

    }

    public static double min(double number1, double number2){
        if(number1 < number2){
            return number1;
        }
        else {
            return number2;
        }
    }

    public static double max (double number1, double number2){
        if (number1 > number2){
            return number1;
        }
        else {
            return number2;
        }
    }
}
