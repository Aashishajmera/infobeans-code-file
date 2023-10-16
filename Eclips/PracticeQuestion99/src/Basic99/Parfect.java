package Basic99;

import java.util.Scanner;

public class Parfect {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number: ");
		int n = scanner.nextInt();

		int sum = 0;

		for (int i = 1; i <= n >> 1; i++) {
			if (n % i == 0) {
				sum += i;
			}
		}
		if (n == sum) {
			System.out.println("Parfect number: ");
		} else {
			System.out.println("Not perfect number: ");
		}
	}
}
