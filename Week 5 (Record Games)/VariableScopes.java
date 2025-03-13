package Week5;
import java.util.Scanner;

public class VariableScopes {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int i =0;
        for( i =0; i < 10; i++) {
            System.out.println(i);
        }
        System.out.println(i);
        int num;
        do{
            num = input.nextInt();
        }while(num<10);
    }
}