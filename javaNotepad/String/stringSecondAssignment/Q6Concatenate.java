// 6. Write a Java program to concatenate a given string to the end of another string

import java.util.Scanner;

class Q6Concatenate{
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first string : ");
        String s1 = sc.nextLine();
        System.out.println("Enter second string: ");
        String s2 = sc.nextLine();

        System.out.println("concatenate of two string: "+(s1+s2));
    }
}