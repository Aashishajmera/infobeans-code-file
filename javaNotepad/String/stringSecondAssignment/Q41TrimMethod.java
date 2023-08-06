// 41. Write a program to Trim a given string using String.trim() method

import java.util.Scanner;

class Q41TrimMethod{
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string value: ");
        String s1 = sc.nextLine();

        String s2 = s1.trim();
        System.out.println(s2);
    }
}