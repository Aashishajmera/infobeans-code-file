package ArrayQues;

import java.util.Scanner;

public class InsertEle {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter size of array: ");
		int size = scanner.nextInt();

		int arr[] = new int[size];
		System.out.println("Enter " + size + " element: ");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scanner.nextInt();
		}

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

		System.out.println("Enter index numberl: ");
		int index = scanner.nextInt();

		if (arr.length >= index) {
			System.out.println("Enter insert element: ");
			int element = scanner.nextInt();

//			int size2 = arr.length + 1;
//			int arr2[] = new int[size2];
//			int temp = 0;
//			boolean flag = true;
//			for (int i = 0; i < arr2.length; i++) {
//				if (index == i) {
//					arr2[temp] = element;
//					flag = false;
//				} else if (flag) {
//					arr2[temp] = arr[i];
//				} else {
//					arr2[temp] = arr[i - 1];
//				}
//				temp++;
//			}
//			System.out.println("\nUpdate array: ");
//			for (int j = 0; j < arr2.length; j++) {
//				System.out.print(arr2[j] + " ");
//			}
			System.out.println("jkhjk");
			for(int i = 0; i < size; i++) {
				if(i== index) {
					arr[index] = element;
//					size++;
					break;
				}else {
					arr[arr.length - i] = arr[arr.length - 1 - i];
				}
			}
			
			System.out.println("\nUpdate array: ");
			for (int j = 0; j < arr.length; j++) {
				System.out.print(arr[j] + " ");
			}
			
		} else {
			System.out.println("Out of index: ");
		}
	}
}
