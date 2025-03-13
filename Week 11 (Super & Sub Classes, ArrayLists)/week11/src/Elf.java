import java.util.Random;

public class Elf extends Character{

    private boolean pointedEars;

    public Elf (String name, boolean pointedEars){
        super(name);
        Random r = new Random();
        this.setAge(500);
        this.setHealth(r.nextInt(50,90));
        this.pointedEars=pointedEars;
    }

    @Override
    public String communicate() {
        return "I'm an elf old and wise";
    }

    @Override
    public void levelUp() {
        this.addExperience(250);
    }

    public boolean isPointedEars() {
        return pointedEars;
    }

    public void setPointedEars(boolean pointedEars) {
        this.pointedEars = pointedEars;
    }

    @Override
    public String toString() {
        return "Elf{" +
                super.toString()+
                "pointedEars=" + pointedEars +
                '}';
    }
}