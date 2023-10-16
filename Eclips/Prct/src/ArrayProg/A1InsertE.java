//package ArrayProg;

import java.util.Scanner;

public class A1InsertE {
	public static void main(String[] args) {
//		System.out.println("\" \"");
		int arr[] = new int[100];

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter size of array: ");
		int size = scanner.nextInt();

		System.out.println("Enter " + size + " element: ");
		for (int i = 0; i < size; i++) {
			arr[i] = scanner.nextInt();
		}

		// print default array
		for (int i = 0; i < size; i++) {
			System.out.print(arr[i] + " ");
		}

		System.out.println("\nEnter index numberl: ");
		int index = scanner.nextInt();

		if (index < size) {
			System.out.println("Enter element: ");
			int element = scanner.nextInt();

			for (int i = 0; i <= size; i++) {
				if (i == index) {
					arr[index] = element;
					size++;
					break;
				} else {
					arr[size - i] = arr[size - i - 1];
				}
			}

			for (int i = 0; i < size; i++) {
				System.out.print(arr[i] + " ");
			}
		} else {
			System.out.println("xdfffx");
		}

	}
}
