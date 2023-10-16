package Basic99;

import java.util.Scanner;

public class Strong {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number: ");
		int n = scanner.nextInt();
		int str = 0, temp = n;
		while (n != 0) {
			int lastDigit = n % 10;
			int mul = 1;
			for (int i = lastDigit; i >= 2; i--) {
				mul *= i;
			}
			str += mul;
			n = n / 10;
		}
		if (temp == str) {
			System.out.println("Strong number: " + str);
		} else {
			System.out.println("Not strong: ");
		}
	}
}
