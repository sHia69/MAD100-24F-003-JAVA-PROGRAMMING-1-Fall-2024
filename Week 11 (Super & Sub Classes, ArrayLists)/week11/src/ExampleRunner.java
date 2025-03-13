import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class ExampleRunner {
    public static List<String> FILES_TO_IGNORE= new ArrayList<String>();
    static {
        FILES_TO_IGNORE.add("Runner.java");
        FILES_TO_IGNORE.add("ExampleRunner.java");
        FILES_TO_IGNORE.add("Character.java");
        FILES_TO_IGNORE.add("Main.java");
    }
    public static void main(String[] args) throws Exception {
        List<Path> files = Files.list(new File("./src").toPath()).toList();
        for (Path file : files){
            if(!FILES_TO_IGNORE.contains(file.getFileName().toString())){

                String className= file.getFileName().toString();
                className=className.substring(0,className.length()-5);
                Class clazz = Class.forName(className);

                try {
                    Object obj = clazz.getMethod("getExampleInstance").invoke(null);
                    if(obj instanceof Character) {
                        Character chars = (Character) obj;
                        System.out.println(clazz);
                        System.out.println(obj.toString());
                        System.out.println(((Character) obj).communicate());
                    }
                }
                catch (Exception e){
                    System.out.println(className+ " missing static getExampleInstance");
                }
            }
        }
    }
}