package Basic99;

import java.util.Scanner;

public class Fibonacci {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number: ");
		int n = scanner.nextInt();
		
		int a = 0, b = 1, c = 0;
		
		for(int i = 1; i <= n; i++) {
			a  = b;
			b = c;
			System.out.println(c);
			c = a+b;
		}
	}
}
