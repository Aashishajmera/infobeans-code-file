package Basic99;

import java.util.Scanner;

public class Armstrong {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter any number: ");
		int n = scanner.nextInt();
		int count = 0, temp = n, lastDigit = 0, mul = 1, arm = 0;
		while (n != 0) {
			n /= 10;
			count++;
		}
		n = temp;

		while (n != 0) {
			lastDigit = n % 10;

			mul = (int) Math.pow(lastDigit, count);
//			for (int i = 1; i <= count; i++) {
//				mul *= lastDigit;
//			}
			
			arm += mul;
			n = n / 10;
		}
		if (temp == arm) {
			System.out.println("Number is armstrong: ");
		} else {
			System.out.println("Not armstrong: ");
		}
	}
}
