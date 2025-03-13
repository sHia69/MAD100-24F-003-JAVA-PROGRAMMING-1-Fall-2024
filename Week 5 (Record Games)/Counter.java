package Week5;
import java.util.Scanner;

public class Counter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double numberInput;
        double highest,lowest;
        System.out.println("Enter the number the student counted to or -1 to quit");
        numberInput = input.nextInt();
        highest = numberInput;
        lowest = numberInput;
        do {
            System.out.println("Enter the number the student counted to or -1 to quit");
            numberInput = input.nextInt();

            if(numberInput!=-1){
                highest = FrancoUtilities.max(highest,numberInput);
                lowest = FrancoUtilities.min(lowest,numberInput);
            }
        }while(numberInput!=-1);

        System.out.println("The highest counted number is "+ highest);
        System.out.println("The lowest counted number is "+ lowest);
    }
}