import java.util.Random;

public class Hisa extends Character {
          public Hisa(String name) {
                    super(name);
                    Random r = new Random();
                    this.setStrength(r.nextInt(50, 100));
                    this.setAge(19);
                    this.setHealth(r.nextInt(50, 100));
          }

          @Override
          public String communicate() {
                    return "I'm a Hisa, I'm Strong and Intelligent";
          }

          @Override
          public void levelUp() {
                    this.addExperience(300);
          }

          public static Hisa getExampleInstance() {
                    return new Hisa("Hisa");
          }

          @Override
          public String toString() {
                    return "Hisa{" + super.toString() + "}";
          }
}