// Review 1

// Create a program to calculate the weighted total of a course with 2 tests worth 50%
// in total, 10 labs worth 30%, 8 quizzes worth 10%, and 3 assignments worth 10%.

// Ask the user to input each of the grades and perform the calculation of
// the final grade based on the weight indicated above.
import java.util.Scanner;

public class Review1 {
    public static void main(String[] args) {
        double overall_avg;
        System.out.println("Welcome to course weight calculator! ");
        Scanner input = new Scanner(System.in);
        // Test function
        System.out.println("Enter test 1 score (Total of 50): ");
        double test = input.nextDouble();

        System.out.println("Enter test 2 score (Total of 50): ");
        double test2 = input.nextDouble();

        // Lab function
        System.out.println("Enter lab 1 score (Total of 10): ");
        double lab = input.nextDouble();
        System.out.println("Enter lab 2 score (Total of 10): ");
        double lab2 = input.nextDouble();
        System.out.println("Enter lab 3 score (Total of 10): ");
        double lab3 = input.nextDouble();
        System.out.println("Enter lab 4 score (Total of 10): ");
        double lab4 = input.nextDouble();
        System.out.println("Enter lab 5 score (Total of 10): ");
        double lab5 = input.nextDouble();
        System.out.println("Enter lab 6 score (Total of 10): ");
        double lab6 = input.nextDouble();
        System.out.println("Enter lab 7 score (Total of 10): ");
        double lab7 = input.nextDouble();
        System.out.println("Enter lab 8 score (Total of 10): ");
        double lab8 = input.nextDouble();
        System.out.println("Enter lab 9 score (Total of 10): ");
        double lab9 = input.nextDouble();
        System.out.println("Enter lab 10 score (Total of 10): ");
        double lab10 = input.nextDouble();

        // Quiz function
        System.out.println("Enter quiz 1 score (Total of 10): ");
        double quiz1 = input.nextDouble();
        System.out.println("Enter quiz 2 score (Total of 10): ");
        double quiz2 = input.nextDouble();
        System.out.println("Enter quiz 3 score (Total of 10): ");
        double quiz3 = input.nextDouble();
        System.out.println("Enter quiz 4 score (Total of 10): ");
        double quiz4 = input.nextDouble();
        System.out.println("Enter quiz 5 score (Total of 10): ");
        double quiz5 = input.nextDouble();
        System.out.println("Enter quiz 6 score (Total of 10): ");
        double quiz6 = input.nextDouble();
        System.out.println("Enter quiz 7 score (Total of 10): ");
        double quiz7 = input.nextDouble();
        System.out.println("Enter quiz 8 score (Total of 10): ");
        double quiz8 = input.nextDouble();

        // Assignment function
        System.out.println("Enter assignment 1 score (Total of 20): ");
        double assign1 = input.nextDouble();
        System.out.println("Enter assignment 2 score (Total of 20): ");
        double assign2 = input.nextDouble();
        System.out.println("Enter assignment 3 score (Total of 20): ");
        double assign3 = input.nextDouble();

        double test_avg = (test/50) * 100 + (test2/50) * 100;
        double lab_avg = (lab/10) * 100 + (lab2 /10) * 100 + (lab3 /10) * 100 + (lab4 /10) * 100 + (lab5 /10) * 100 + (lab6 /10) * 100 + (lab7 /10) * 100 + (lab8 /10) * 100 + (lab9 /10) * 100 + (lab10 /10) * 100;
        double quiz_avg = (quiz1/10) * 100 + (quiz2/10) * 100 + (quiz3/10) * 100 + (quiz4/10) * 100 + (quiz5/10) * 100 + (quiz6/10) * 100 + (quiz7/10) * 100 + (quiz8/10) * 100;
        double assign_avg = (assign1/20) * 100 + (assign2/20) * 100 + (assign3/20) * 100;

        overall_avg = (test_avg * 0.50) + (lab_avg * 0.30) + (quiz_avg * 0.10) + (assign_avg *0.30);
        System.out.println("Your final grade is: " + overall_avg);


    }

}
