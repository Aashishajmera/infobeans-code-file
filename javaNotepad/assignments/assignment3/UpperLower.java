import java.util.Scanner;
public class UpperLower {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a char (a to z)");
        char ch = sc.next().charAt(0);
        if(ch >= 65 && ch <= 90){
            System.out.println("Uppercase: ");
        }else{
            System.out.println("Lowercase: ");
        }
    }
}
