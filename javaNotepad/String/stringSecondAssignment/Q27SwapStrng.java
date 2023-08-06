// 27. Write a Java program to Swap Two Strings

import java.util.Scanner;

class Q27SwapStrng{
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first string: ");
        String s1 = sc.nextLine();
        System.out.println("Enter second string: ");
        String s2 = sc.nextLine();

        String s3 = "";

        s3 = s1 ;
        s1 = s2;
        s2 = s3;
        
        System.out.println(s1);
        System.out.println(s2);
    }
}