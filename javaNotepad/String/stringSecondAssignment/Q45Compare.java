// 45. Write a program to Compare the strings using equals(), compareTo() and == operator

import java.util.Scanner;

class Q45Compare{
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first string: ");
        String s1 = sc.nextLine();
        System.out.println("Enter second string: ");
        String s2 = sc.nextLine();

        // equal method: 
        boolean flag= s1.equals(s2);
        System.out.println("Equal method output: "+flag);

        // compare method: 
        int n = s1.compareTo(s2);
        System.out.println("Compare method output: "+n);

        // == operator: 
        System.out.println("equal operator output: "+(s1 == s2));
    }
}