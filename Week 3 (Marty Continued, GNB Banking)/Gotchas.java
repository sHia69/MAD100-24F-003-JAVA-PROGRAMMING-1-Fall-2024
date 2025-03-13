package Week3;
import java.util.Scanner;

public class Gotchas {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //String value = "test";
        String inputVal = input.next();
        if (inputVal == "test"){
            System.out.println("true");
        }
        else if ("test".equals(inputVal)){
            System.out.println("true - equals");
        }
        else{
            System.out.println("false");
        }
    }
}
