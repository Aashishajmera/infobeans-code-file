
import java.util.Scanner;

public class CharacterToObj {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter character value: ");
        char ch = sc.next().charAt(0);
        
        Character chobj = ch;  // auto-boxing
        
        Character cobj = new Character(ch); // boxing
        
        System.out.println("Entered value is: "+cobj);
    }
}
