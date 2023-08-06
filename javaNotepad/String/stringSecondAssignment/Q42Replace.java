// 42. Write a program to Replace string with another string in java using String.replace() method

import java.util.Scanner;

class Q42Replace{
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string value: ");
        String s1 = sc.nextLine();
        System.out.println("Enter second string value: ");
        String s2 = sc.nextLine();

       String s3 = s1.replace(s1, s2);
        System.out.println(s3);
    }
}