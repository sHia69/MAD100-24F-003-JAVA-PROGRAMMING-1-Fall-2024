package Week5;
public class FuncTest {
    public static void main(String[] args) {

        int output = getX(4,6,7);
        System.out.println(output);
        //118
        //68
        //44
        //64
        //49
        //58
    }

    public static int getX(int x, int y, int z){
        return getY(y)+z*x;
    }

    public static int getY(int x){
        return x*x;
    }
}