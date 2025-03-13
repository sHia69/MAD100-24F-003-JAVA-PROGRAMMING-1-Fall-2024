import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class ClassSort {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of students:");
        int numOfNumbers = input.nextInt();
        input.nextLine();
        String[] studentNames = new String[numOfNumbers];

        for (int i = 0; i < studentNames.length; i++) {
            System.out.println("Enter the name of student " + (i + 1) + ":");
            studentNames[i] = input.nextLine();
        }

        System.out.println("How would you like the students displayed: \n" +
                "1) Alphabetical Order\n" +
                "2) Reverse Alphabetical Order");
        int sortOrder = input.nextInt();

        if (sortOrder == 1) {
            Arrays.sort(studentNames);
        } else if (sortOrder == 2) {
            Arrays.sort(studentNames, Collections.reverseOrder());
        } else {
            System.out.println("Invalid option. Displaying in original order.");
        }

        System.out.println("Class list:");
        for (String studentName : studentNames) {
            System.out.println(studentName);
        }
    }
}