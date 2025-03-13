import java.util.Scanner;
import java.util.StringTokenizer;

public class CaesarCipher {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the top secret encoding system!");
        System.out.println("What would you like to do? \n" +
                "1) encrypt \n" +
                "2) decrypt \n");
        int choice = input.nextInt();
        input.nextLine();
        System.out.println("Enter the message: ");
        String message = input.nextLine();
        System.out.println("Enter the key: (1-26)");
        int key = input.nextInt();
        String transformedText = cipher(message, choice, key);
        
        if (choice == 1) {
            System.out.println("The encrypted message is " + transformedText);
        } else {
            System.out.println("The decrypted message is " + transformedText);
        }
    }

    public static String cipher(String text, int mode, int key) {
        String cipherText = "";
        String cipherWord;
        String token;

        int amount;
        StringTokenizer machine = new StringTokenizer(text, " "); 

        while (machine.hasMoreTokens()) {
            cipherWord = "";
            token = machine.nextToken();
            if (mode == 1) { 
                for (int i = 0; i < token.length(); i++) {
                    if (((int) token.charAt(i) + key) > 122) {
                        amount = ((int) token.charAt(i) + key) - 122;
                        cipherWord += (char) (96 + amount);
                    } else {
                        cipherWord += (char) ((int) token.charAt(i) + key);
                    }
                }
            } else if (mode == 2) { // Decrypt mode
                for (int i = 0; i < token.length(); i++) {
                    if (((int) token.charAt(i) - key) < 97) {
                        amount = 96 - ((int) token.charAt(i) - key);
                        cipherWord += (char) (122 - amount);
                    } else {
                        cipherWord += (char) ((int) token.charAt(i) - key);
                    }
                }
            }
            cipherText += cipherWord + " "; 
        }
        return cipherText;
    }
}
