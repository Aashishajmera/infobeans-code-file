// 15) WAP to print alphabets in lowercase

import java.util.Scanner;

public class Q15Lowercase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any alphabet in Uppercase: ");
        char ch = sc.next().charAt(0);
        if(ch >= 65 && ch <=90){
            ch += 32;
            System.out.println(ch);
        }
    }
}
