package Basic;

import java.util.Scanner;

public class Factorial {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number: ");
		int n = scanner.nextInt();
		if(n>0) {
			int fact = 1;
			for(int i = n; i >= 2; i--) {
				fact *= i;
			}
			System.out.println("Factorial is: "+fact);
		}else {
			System.out.println("Number is negative");
		}
	}
}
