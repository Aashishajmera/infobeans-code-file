import java.io.Console;

public class PassHide{
    public static void main(String[] args) {

        String name = "Aashish";
        Console console = System.console();
        char[] chars = console.readPassword();
        String s = new String(chars);

        if(s.equals(name)){
            System.out.println("match passs");
        }else{
            System.out.println("Not match: ");
        }
    }
}