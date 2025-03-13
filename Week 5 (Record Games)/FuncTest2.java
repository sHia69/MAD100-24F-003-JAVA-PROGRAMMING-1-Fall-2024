package Week5;
public class FuncTest2 {
    public static void main(String[] args) {

        int output = getX(6,9,2);
        //getY(2)+getZ(6)+getY(9)*getZ(6)
        // (2*2) + (getY(6)+6) + (9*9) * (getY(6)+6)
        // (2*2) + (6*6+6) + (9*9) * (6*6+6)
        // 4 + 42 + 81 * 42
        // 3448
        System.out.println(output);
    }

    public static int getX(int x, int y, int z){
        return getY(z)+getZ(x)+getY(y)*getZ(x);
    }

    public static int getY(int x){
        return x*x;
    }
    public static int getZ(int y){
        return getY(y)+y;
    }
}