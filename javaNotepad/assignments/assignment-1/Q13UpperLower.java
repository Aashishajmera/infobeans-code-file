// 13. Program to convert uppercase to lowercase

import java.util.Scanner;

public class Q13UpperLower {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any character in Uppercase: ");
        char ch = sc.next().charAt(0);

        if(ch >= 65 && ch <= 90){
            ch += 32;
            System.out.println(ch);
        }else{
            System.out.println(" Entered Character is not a capital: ");
        }


    }
}
