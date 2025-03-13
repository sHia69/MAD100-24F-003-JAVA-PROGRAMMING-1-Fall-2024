public class Main {

    public static void main(String[] args){
        Character[] characters = new Character[4];
        characters[0] = new Human("Franco");
        characters[1] = new Orc("Tom",false);
        characters[2] = new Elf("Moe Money",true);
        characters[3] = new Hisa("Hisa");

        for (Character character: characters){
            System.out.println(character.communicate());
        }
    }
}