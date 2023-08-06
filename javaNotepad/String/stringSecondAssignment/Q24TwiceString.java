// 24. Write a Java program to create a new string repeating every character twice of a given string

import java.util.Scanner;

class Q24TwiceString{
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string: ");
        String s1 = sc.nextLine();

        String s2 = s1;
        System.out.println("Enter string is: "+s1);
        System.out.println("repeating string is: "+s2);
    }
}