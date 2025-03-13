import java.util.Random;

public class Orc extends Character{
    private boolean hasTusk;
    public Orc (String name, boolean hasTusk){
        super(name);
        Random r = new Random();
        this.hasTusk=hasTusk;
        this.setAge(100);
        this.setHealth(r.nextInt(70,120));
    }
    public void levelUp(){
        this.addExperience(200);
    }
    public String communicate(){
        return "Greetings I'm and Orc .... RAWWRWRWGGG";
    }

    public boolean isHasTusk() {
        return hasTusk;
    }

    public void setHasTusk(boolean hasTusk) {
        this.hasTusk = hasTusk;
    }

    @Override
    public String toString() {
        return "Orc{" +
                super.toString() +
                "hasTusk=" + hasTusk +
                '}';
    }
}