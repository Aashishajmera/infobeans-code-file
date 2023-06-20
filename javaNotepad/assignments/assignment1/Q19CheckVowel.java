// 19. WAP to enter a character and check it is vowel or not

public class Q19CheckVowel {
    public static void main(String[] args) {
        char ch = 'o';
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I'
                || ch == 'O' || ch == 'U') {
            System.out.println(ch + " is a Vowel: ");
        } else {
            System.out.println(ch + " is not a Vowel: ");
        }
    }
}