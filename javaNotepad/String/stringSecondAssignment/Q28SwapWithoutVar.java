// 28. Write a Java program to Swap Two Strings without Third String Variable

import java.util.Scanner;

class Q28SwapWithoutVar{
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first string: ");
        String s1 = sc.nextLine();
        System.out.println("Enter second string: ");
        String s2 = sc.nextLine();

        s1 = s1 + s2;
        s2 = substring(0, s1.length()-s2.length());
        s1 = substring(s2.length() - s1.length());
    }
}