/* Name: Hia Al Saleh
* Date: October 11th, 2024
* Purpose: Creating a java program that will calculate the percentage of income being spent on each expense.
* The program should ask the user how many expenses they have each month and their monthly income
* then the cost for each expense.
* Finally, the program should output the percentage of the user's income per expense and the total percentage of income spent,
* and the highest amount spent on a single item.
* ----------------------------------------------
* */

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        // The scanner method
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to percentage of income calculator! \n");
        System.out.println("How many expenses do you have? ");
        int expenses = input.nextInt();
        System.out.println("What is your income per month? ");
        int income = input.nextInt();

        // The calculations
        double totalSpent = 0;
        double highestExpense = 0;

        for (int i = 1; i <= expenses; i++) {
            System.out.println("Enter the cost for expense " + i + ": ");
            double cost = input.nextDouble();
            totalSpent += cost;

            if (cost > highestExpense) {
                highestExpense = cost;
            }

            double percentage = (cost / income) * 100;
            System.out.println("Expense " + i + " is " + percentage + "% of your income.");
        }

        double totalPercentage = (totalSpent / income) * 100;
        System.out.println("Total percentage of income spent: " + totalPercentage + "%");
        System.out.println("Highest amount spent on a single item: " + highestExpense);
    }
}
