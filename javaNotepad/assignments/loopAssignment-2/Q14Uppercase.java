// 14) WAP to print alphabets in uppercase

import java.util.Scanner;

public class Q14Uppercase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any alphabets in lowercase: ");
        char ch = sc.next().charAt(0);
        if (ch >= 97 && ch <= 122) {
            ch -= 32;
            System.out.println(ch);
        }
    }
}