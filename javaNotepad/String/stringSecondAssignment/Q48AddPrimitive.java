// 48. Write a program to String concatenation with primitive data type values

import java.util.Scanner;

class Q48AddPrimitive{
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string value: ");
        String s1 = sc.nextLine();
        System.out.println("Enter any digit: ");
        int n = sc.nextInt();

        String s2 = s1 + n;
        System.out.println(s2);
    }
}