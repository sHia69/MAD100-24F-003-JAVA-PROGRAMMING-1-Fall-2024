import java.util.Scanner; // For scanner

public class Calculator {
    public static void main(String[] args) {
        int choice;
        double firstNumber, secondNumber;
        double solution;

        Scanner input = new Scanner(System.in);
        // Display all possible forms of arithmetic
        System.out.println("Welcome to Calculator app\n"
                + "1) Perform Multiplication: \n"
                + "2) Perform Division \n"
                + "3) Perform Subtraction \n"
                + "3) Perform Subtraction \n"
                + "4) Perform Addition \n"
                + "5) Perform Modulus \n "
                + "Please select a number (1-5): ");
        // Allow the user to input which form of arithmetic they would like to perform
        choice = input.nextInt();
        System.out.println("Please enter first number: ");
        firstNumber = input.nextDouble();
        System.out.println("Please enter second number: ");
        secondNumber = input.nextDouble();
        // perform the selected arithmetic on the input numbers
        switch (choice){
            case 1:
        solution = firstNumber * secondNumber;
        System.out.println(firstNumber+"*" + secondNumber + "=" + solution);
        break;
            case 2:
        solution = firstNumber / secondNumber;
        System.out.println(firstNumber+"/" + secondNumber + "=" + solution);
        break;
            case 3:
        solution = firstNumber - secondNumber;
        System.out.println(firstNumber+"-" + secondNumber + "=" + solution);
        break;
            case 4:
        solution = firstNumber + secondNumber;
        System.out.println(firstNumber+"+" + secondNumber + "=" + solution);
        break;
            case 5:
        solution = firstNumber % secondNumber;
        System.out.println(firstNumber+"%" + secondNumber + "=" + solution);
        break;
        }
        // Output the solution
    }
}
