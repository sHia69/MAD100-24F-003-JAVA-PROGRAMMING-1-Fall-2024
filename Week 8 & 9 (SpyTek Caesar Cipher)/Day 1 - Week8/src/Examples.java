import java.util.StringTokenizer;

public class Examples {
    public static void main(String[] args) {
        String exampleValue = "JAVA IS AWESOMe";
        System.out.println(exampleValue.toLowerCase());
        StringTokenizer tokenizer = new StringTokenizer("Java is awesome", " ");

        while (tokenizer.hasMoreTokens()){
            String value = tokenizer.nextToken();
            for (int i = 0; i< value.length(); i++){
                //System.out.println(value.charAt(i));
                char character = value.charAt(i);
                character = (char)((int)value.charAt(i)+1);
                System.out.println(character);
            }
            //System.out.println(value);
        }
    }
}