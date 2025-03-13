import java.util.ArrayList;

public class Runner {
    public static void main(String[] args) {
        ArrayList<Character> characters = new ArrayList<Character>();
        characters.add(new Human ("Franco"));
        characters.add(new Orc("Tom",false));
        characters.add(new Elf("Moe Money",true));
        System.out.println(Human.TYPE);
        for (Character character: characters){

            System.out.println(character.communicate());
        }
    }
}