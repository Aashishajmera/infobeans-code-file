package Basic99;

import java.util.Scanner;

public class Palindrom {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n = scanner.nextInt();
		
		int lastdigit = 0, reverse = 0, temp = n;
		
		while(n != 0) {
			lastdigit = n % 10;
			reverse = reverse * 10 + lastdigit;
			n /= 10;
		}
		if(temp == reverse) {
			System.out.println("Number is palindrom: ");
		}else {
			System.out.println("Not palindrom: ");
		}
	}
}
