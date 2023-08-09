// 14. Write a Java program to get the canonical representation of the string object

import java.util.Scanner;

class Q14Canonical{
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first string: ");
        String s1 = sc.nextLine();
        System.out.println("Enter second string value: ");
        String s2 = sc.nextLine();

        System.out.println(s1 == s2);
    }
}