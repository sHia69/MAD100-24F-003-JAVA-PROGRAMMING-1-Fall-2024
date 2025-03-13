package Week5;
public class FrancoUtilities {

    public static double min (double number1, double number2){
        if(number1 < number2){
            return number1;
        }
        else {
            return number2;
        }
    }

    public static double max ( double number1, double number2 ){
        if (number1>number2){
            return number1;
        }
        else {
            return number2;
        }
    }
}