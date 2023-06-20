// 14. program to convert lowercase to uppercase

import java.util.Scanner;

public class Q14LowerUpper {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any character in lowercase: ");
        char ch = sc.next().charAt(0);

        if(ch >= 97 && ch <= 122){
            ch -= 32;
            System.out.println(ch);
        }else{
            System.out.println("Entered character is not a lowercase: ");
        }
    }
}
