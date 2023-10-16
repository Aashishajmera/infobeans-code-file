package ArrayQues;

import java.util.Scanner;

public class DeleteE {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter size of array: ");
		int size = scanner.nextInt();

		int arr[] = new int[size];
		System.out.println("Enter " + size + " element: ");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scanner.nextInt();
		}

		System.out.println("Enter element: ");
		int ele = scanner.nextInt();

		boolean flag = true;
		int count = 0, index = 0;
		for (int j = 0; j < arr.length; j++) {
			if (ele == arr[j]) {
				count++;
			}
		}

		if (count >= 1) {
			System.out.println(count);
			int arr2[] = new int[arr.length - count];

			for (int i = 0; i < arr.length - 1; i++) {
				if (ele == arr[i]) {
					arr2[index] = arr[i + 1];
					flag = false;
				} else if (flag) {
					arr2[index] = arr[i];
				} else {
					arr2[index] = arr[i + 1];
				}
				index++;
			}

//			for (int i = 0; i < arr2.length; i++) {
//				System.out.print(arr2[i] + " ");
//			}
		} else {
			System.out.println("Element not found: ");
		}

	}
}
