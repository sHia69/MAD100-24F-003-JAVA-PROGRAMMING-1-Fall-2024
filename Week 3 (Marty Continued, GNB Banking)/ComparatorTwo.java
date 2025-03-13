package Week3;
import java.util.Scanner;

public class ComparatorTwo {
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

        if (num1 > num2){
            System.out.println ("The first number is greater than the second");
        }
        else if(num1 < num2){
            System.out.println("The first number is less than the second");
        }
        else if(num1 == num2){
            System.out.println("The first number is equal to the second");
        }
        else{
            System.out.println("Some how you entered 2 numbers that are not related");
        }
    }
}