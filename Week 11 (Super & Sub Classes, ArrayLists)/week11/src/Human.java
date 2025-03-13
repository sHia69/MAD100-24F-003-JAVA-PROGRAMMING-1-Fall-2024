import java.util.Random;

public class Human extends Character{
    public static final char[] TYPE = null;

public Human (String name){
        super(name);
        Random r = new Random();
        this.setHealth(r.nextInt(50,100));
        this.setAge(20);
    }

    public void levelUp(){
        this.addExperience(150);
    }

    @Override
    public String communicate() {
        return "Hi, I'm a human named "+this.getName();
    }

    @Override
    public String toString() {
        return "Human{"+super.toString()+"}";
    }
}