// 28. Write a Java program to Swap Two Strings without Third String Variable

import java.util.Scanner;

class Q28SwapWithoutVar{
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first string: ");
        String s1 = sc.nextLine();
        System.out.println("Enter second string: ");
        String s2 = sc.nextLine();
        int lastIndex = s1.length();
        s1 = s1 + s2;
        s2 = s1.substring(0, lastIndex);
        s1 = s1.substring(lastIndex);
      
        System.out.println(s1);
        System.out.println(s2);
    }
}