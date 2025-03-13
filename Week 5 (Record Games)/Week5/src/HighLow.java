import java.util.Scanner;

public class HighLow {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double num, highest, lowest;
        System.out.println("This program will allow the user to enter a series of a number \n" +
                "and determine the largest and smallest number entered.");
        System.out.println("Please enter a number");
        num = input.nextDouble();
        highest = num;
        lowest = num;

        do{
        if(num != -1){
            highest = Comparator.max(highest, num);
            lowest = Comparator.min(lowest, num);
        }
        }while(num !=-1);

        System.out.println("The highest number is " + highest);
        System.out.println("The lowest number is " + lowest);

    }
}
