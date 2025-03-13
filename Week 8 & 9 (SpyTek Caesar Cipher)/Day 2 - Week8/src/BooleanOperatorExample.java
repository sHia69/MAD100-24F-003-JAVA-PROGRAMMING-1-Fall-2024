public class BooleanOperatorExample {
    public static void main(String[] args) {
        // && is and
        // || is or
        // ! is not
        int x = 10;
        int y = 15;
        if ( !(x > 20  || !(y < 20 ))){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }

    }
}