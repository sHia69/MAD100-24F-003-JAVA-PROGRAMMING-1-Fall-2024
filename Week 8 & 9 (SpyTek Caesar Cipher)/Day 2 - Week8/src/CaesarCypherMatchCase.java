import java.util.Scanner;
import java.util.StringTokenizer;

public class CaesarCypherMatchCase {
    public static void main(String[] args) {
        final boolean DEBUG = false;
        Scanner input = new Scanner(System.in);
        //encryption or decryption
        System.out.println("What would you like to do?\n" +
                "1) encrypt\n" +
                "2) decrypt");
        int mode = input.nextInt();
        //key
        System.out.println("Enter the key size");
        int key = input.nextInt();
        //message
        input.nextLine();
        System.out.println("Enter the message");
        String msg = input.nextLine();
        //output result
        //Happy Halloween
        //Voddm Vozzckssb  key=14
        if (mode == 1){
            System.out.println(encrypt(msg, key));
        }
        else if(mode ==2) {
            System.out.println(decrypt(msg, key));
        }
        else {
            System.out.println("Choose 1 or 2");
        }
        if (DEBUG) System.out.println(mode+ " "+ key +" \n"+msg);
    }

    public static String encrypt(String msg, int key){
        StringTokenizer tokenizer = new StringTokenizer(msg, " ");
        String cypher = "";
        while (tokenizer.hasMoreTokens()){
            String value = tokenizer.nextToken();
            for (int i = 0; i< value.length(); i++){
                char character = value.charAt(i);
                if((character >='a' && character<='z')
                        || (character >='A' && character <='Z')) {
                    int asciiValue = (int) value.charAt(i) + key;

                    if ((asciiValue > 122 && character >= 'a' && character <= 'z')
                            || (asciiValue > 90) && character >= 'A' && character <= 'Z') {
                        asciiValue -= 26;
                    }

                    character = (char) asciiValue;
                }
                cypher+=character;
            }
            cypher+=" ";
        }
        return cypher; // Change to message
    }
    public static String decrypt(String cypher, int key){
        StringTokenizer tokenizer = new StringTokenizer(cypher, " ");
        String text = "";
        while (tokenizer.hasMoreTokens()){
            String value = tokenizer.nextToken();
            for (int i = 0; i< value.length(); i++){
                char character = value.charAt(i);
                if((character >='a' && character<='z')
                        || (character >='A' && character <='Z')) {
                    int asciiValue = (int) value.charAt(i) - key;
                    if ((asciiValue < 97 && character>='a' && character<='z')
                        ||(asciiValue < 65 && character>='A' && character<='Z') ){
                        asciiValue += 26;
                    }
                    character = (char) asciiValue;
                }
                text+=character;
            }
            text+=" ";
        }
        return text; // Change to message
    }
}