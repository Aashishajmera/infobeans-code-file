// 43. Write a program to Convert any type of value to string value using String.valueOf() method

import java.util.Scanner;

class Q43ValueOf{
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number: ");
        int n = sc.nextInt();        
        // s1.valueOf(null, 0, 0)
        String s1 = String.valueOf(n);
        System.out.println(s1+20);

        
    }
}