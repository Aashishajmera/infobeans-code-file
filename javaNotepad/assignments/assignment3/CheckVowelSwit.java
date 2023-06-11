import java.util.Scanner;

public class CheckVowelSwit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter  any char (a to z)");
        char ch = sc.next().charAt(0);

        switch (ch) {
            case 'a', 'A':
                System.out.println("vowel: ");
                break;
            case 'e', 'E':
                System.out.println("vowel: ");
                break;
            case 'i', 'I':
                System.out.println("vowel: ");
                break;
            case 'o', 'O':
                System.out.println("vowel: ");
                break;
            case 'u', 'U':
                System.out.println("vowel: ");
                break;
            default:
                System.out.println("Consonants: ");
        }
    }
}
