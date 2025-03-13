package Week4;
import java.util.Random;
import java.util.Scanner;

public class EasterEggGame {
    public static void main(String[] args) {
        final Boolean DEBUG = false;
        Scanner input = new Scanner(System.in);
        Random random = new Random();
        int totalScore = 0;
        int difficulty;
        //Welcome user to the game and ask them for difficulty level
        System.out.println("Welcome to the ultra secret guessing game.");
        do {
            System.out.println("Please select a difficulty\n" +
                    "1) Easy (1-10)\n" +
                    "2) Medium (1-25)\n" +
                    "3) Hard (1-50)\n");
            //Accept user input for difficulty level

             difficulty = input.nextInt();
        } while (difficulty > 3 );
        //Ask the user the number of rounds, take as input
        System.out.println("How many rounds would you like to play?");
        int numOfRounds = input.nextInt();
        // PER ROUND:
        for (int i =0; i< numOfRounds; i++){
            int winningNumber=0;
            //  Generate proper random answer based on difficulty level
            switch (difficulty){
                case 1: winningNumber = random.nextInt(10)+1;
                        break;
                case 2: winningNumber = random.nextInt(25)+1;
                        break;
                case 3: winningNumber = random.nextInt(50)+1;
                        break;
            }
            //  Ask user for number guess until correct
            int userChoice;
            int guesses=0;
            if(DEBUG) {
                System.out.println("DEBUG - " + winningNumber);
            }
            do{
                System.out.println("Please enter your guess: ");
                userChoice = input.nextInt();
                guesses++;
            } while (userChoice!=winningNumber);
            //  Add score to total score
            totalScore+=guesses;
            System.out.println("It took "+guesses+" to guess the number");
        }

        //Display Total Score (lower is better)
        System.out.println("Total score: "+totalScore);
    }
}
