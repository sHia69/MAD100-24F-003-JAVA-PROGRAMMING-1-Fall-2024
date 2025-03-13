package Week3;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the advanced calculator\n" +
                "1) Calculate a number raised to the power of another number\n" +
                "2) Calculate the log base 10 of a number\n" +
                "3) Calculate the square root of a number\n" +
                "Choose an option (1-3)");
        int choice = input.nextInt();
        System.out.println("Choose a number to perform the calculation on: ");
        double num1 = input.nextDouble();
        double solution;
        switch(choice) {
            case 1:
                    System.out.println("What power would you like to raise "+num1 +" to:");
                    int power = input.nextInt();
                    solution = Math.pow(num1,power);
                    System.out.println(num1+ " to the power of "+power+" = "+ solution);
                    break;
            case 2:
                    solution = Math.log10(num1);
                    System.out.println("The log10 of "+ num1 + " is "+solution);
                    break;
            case 3:
                    solution = Math.sqrt(num1);
                    System.out.println("The squareroot of "+num1 +" is "+solution);
                    break;

        }
    }
}
