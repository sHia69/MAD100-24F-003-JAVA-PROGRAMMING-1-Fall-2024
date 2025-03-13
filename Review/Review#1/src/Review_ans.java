// Create a program to calculate the weighted total of a course with 2 tests worth 50%
// in total, 10 labs worth 30%, 8 quizzes worth 10%, and 3 assignments worth 10%.

// Ask the user to input each of the grades and perform the calculation of
// the final grade based on the weight indicated above.

import java.util.Scanner;

public class Review_ans {
    public static void main(String[] args) {
        double testAvg = takeInCat("test", 2);
        double labAvg = takeInCat("lab", 10);
        double quizAvg = takeInCat("quiz", 10);
        double assignAvg = takeInCat("Assignment", 3);

        double finalGrade = testAvg * 0.5 + labAvg * 0.3 + quizAvg * 0.1 + assignAvg * 0.1;
        System.out.println("Your final grade is: " + finalGrade);

    }

    public static double takeInCat(String catName, int numofassest){
        Scanner input = new Scanner(System.in);
        double catAvg = 0;
        for (int i = 1; i <= numofassest; i ++){
            System.out.println("Please enter you percentage earned for " + catName + " " + i);
            catAvg += input.nextDouble();
        }
        catAvg = catAvg / numofassest;
        return catAvg;
    }
}
/*
 * import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double testAvg = takeInCat("test", 2);
        double labAvg = takeInCat("lab", 10);
        double quizAvg = takeInCat("quiz", 10);
        double assignAvg = takeInCat("Assignment", 3);

        // Calculate the overall average (adjust weights if necessary)
        double overallAvg = (testAvg * 0.5) + (labAvg * 0.2) + (quizAvg * 0.1) + (assignAvg * 0.1);
        
        // Display the result
        System.out.printf("Your overall average is: %.2f\n", overallAvg);
    }

    public static double takeInCat(String catName, int numofassest) {
        Scanner input = new Scanner(System.in);
        double catAvg = 0;
        for (int i = 1; i <= numofassest; i++) {
            System.out.print("Enter " + catName + " score " + i + ": ");
            catAvg += input.nextDouble();
        }
        catAvg = catAvg / numofassest;
        return catAvg;
    }
}

 */