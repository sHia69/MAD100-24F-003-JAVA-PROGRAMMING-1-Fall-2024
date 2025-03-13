import java.util.Random;

public abstract class Character {
    private String name;
    private int age;
    private int health;
    private int experience;
    private int intelligence;
    private int strength;
    private int accuracy;
    private int defense;
    private int wisdom;
    private int luck;
    private int agility;

    public Character(String name){
        this.name=name;
        Random r = new Random();
        this.setStrength(r.nextInt(50,100));
        this.setAccuracy(r.nextInt(50,100));
        this.setIntelligence(r.nextInt(50,100));
        this.setAgility(r.nextInt(50,100));
        this.setDefense(r.nextInt(50,100));
        this.setWisdom(r.nextInt(50,100));
        this.setLuck(r.nextInt(50,100));
    }

    public abstract String communicate();
    public abstract void levelUp();

    protected void addExperience(int experience){
        this.experience+=experience;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getAccuracy() {
        return accuracy;
    }

    public void setAccuracy(int accuracy) {
        this.accuracy = accuracy;
    }

    public int getDefense() {
        return defense;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }

    public int getWisdom() {
        return wisdom;
    }

    public void setWisdom(int wisdom) {
        this.wisdom = wisdom;
    }

    public int getLuck() {
        return luck;
    }

    public void setLuck(int luck) {
        this.luck = luck;
    }

    public int getAgility() {
        return agility;
    }

    public void setAgility(int agility) {
        this.agility = agility;
    }



    @Override
    public String toString() {
        return
                "name='" + name + '\'' +
                ", age=" + age +
                ", health=" + health +
                ", experience=" + experience +
                ", intelligence=" + intelligence +
                ", strength=" + strength +
                ", accuracy=" + accuracy +
                ", defense=" + defense +
                ", wisdom=" + wisdom +
                ", luck=" + luck +
                ", agility=" + agility
                ;
    }
}