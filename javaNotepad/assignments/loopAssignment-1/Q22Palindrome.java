// 22. WAP to print all palindrome number from 101 to 199 

public class Q22Palindrome {
    public static void main(String[] args) {
        int lastDigit = 0, reverse = 0;
        for (int i = 101; i <= 199; i++) {
            for (int j = i; j != 0; j /= 10) {
                lastDigit = j % 10;
                reverse = (reverse*10) + lastDigit;
            }
             if (i == reverse) {
                    System.out.println(i + " is palindrome number: ");
                }   
            reverse=0;
        }
    }
}