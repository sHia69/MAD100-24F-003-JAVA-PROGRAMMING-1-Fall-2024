package Week4;
import java.util.Random;

public class TestRandom {
    public static void main(String[] args) {
        Random rand = new Random();//new Random(20);
        System.out.println(rand.nextInt());
        //System.out.println((rand.nextInt(10)+1)); //1-10
        //System.out.println(rand.nextInt(31)+20); //20-50
        for (int i = 0;i<10;i++){
            System.out.println(i+" - "+(rand.nextInt(31)+20)); //20-50
        }
        int randomNum;
        do {
            randomNum = rand.nextInt(31) + 20;
            System.out.println(randomNum);
        } while (randomNum >= 20);
    }
}    
