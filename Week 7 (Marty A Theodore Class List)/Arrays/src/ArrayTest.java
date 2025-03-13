import java.util.Scanner;

public class ArrayTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int [] lotto = new int[6];
        String [] wordsForNumbers = {"first", "second", "third", "fourth", "fifth", "sixth"};
        /*
        lotto[0]=7;
        lotto[1]= 24;
        lotto[2]=8;
        lotto[3]=16;
        lotto[4]=14;
        lotto[5]=13;
        */
        for (int i = 0; i< 6; i++){
            System.out.println("Enter" + wordsForNumbers + " number: " + i );
            lotto[i]=input.nextInt();
        }
        for (int i = 0; i<6; i ++){
            System.out.println(lotto[i]+ " ");
        }

    }
}
