package Week3;
import java.util.Scanner;

public class LoansEstimator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        final double prime = 2;
        int creditScore;
        double interest=0;
        double amountBorrowing;
        boolean loanApproved=true;
        System.out.println("Welcome to GNB loan calculator\n" +
                "Please enter your credit score:");
        creditScore = input.nextInt();
        System.out.println("Please enter the amount you'd like to borrow");
        amountBorrowing = input.nextDouble();
        if (creditScore >= 781){
            interest = prime;
        }
        else if (creditScore>=661){
            if(amountBorrowing<30000){
                interest = prime + 0.5;
            }
            else{
                interest = prime + 1;
            }
        }
        else if ( creditScore >= 601){
            if(amountBorrowing<30000){
                interest = prime + 1;
            }
            else{
                interest = prime + 2;
            }
        }
        else if ( creditScore >= 501){
            if (amountBorrowing<30000){
                interest = prime + 2;
            }
            else{
                interest = prime + 5;
            }
        }
        else{
            if(amountBorrowing<30000){
                interest = prime + 5;
            }
            else{
                loanApproved=false;
            }
        }

        if(loanApproved){
            double amountPaidOver5Years = amountBorrowing * (interest/100) * 5 + amountBorrowing;
            double amountPaidOver10Years = amountBorrowing * (interest/100) * 10 + amountBorrowing;
            System.out.println("You've been approved for "+ amountBorrowing+ " your interest rate will be "+interest+"%.");
            System.out.println("After 5 years you'll have paid "+amountPaidOver5Years);
            System.out.println("After 10 years you'll have paid "+amountPaidOver10Years);
        }
        else {
            System.out.println("Your loan was not approved");
        }
    }
}
