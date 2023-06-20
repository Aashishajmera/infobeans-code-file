// 12. Check given character is vowel or not using switch case 

import java.util.Scanner;

public class QQ12VowelOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any Character: ");
        char ch = sc.next().charAt(0);

        switch (ch) {
            case 'a', 'A':
                System.out.println("Vowel: ");
                break;
            case 'e', 'E':
                System.out.println("Vowel: ");
                break;
            case 'i', 'I':
                System.out.println("Vowel: ");
                break;
            case 'o', 'O':
                System.out.println("Vowel: ");
                break;
            case 'u', 'U':
                System.out.println("Vowel: ");
                break;
            default:
                System.out.println("Not vowel: ");

        }
    }
}
