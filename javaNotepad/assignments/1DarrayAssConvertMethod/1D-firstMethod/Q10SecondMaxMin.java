// ===10. Find the 2nd max & 2nd min element

import java.util.Scanner;

class MaxMin {
	public void maxMin(int arr[], int max, int min, int smax, int smin) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				smax = max;
				max = arr[i];
			} else if (arr[i] > smax && max != arr[i]) {
				smax = arr[i];
			}
			if (arr[i] < min) {
				smin = min;
				min = arr[i];
			} else if (smin > arr[i] && min != arr[i]) {
				smin = arr[i];
			}
		}
		System.out.println("Max value is: " + max);
		System.out.println("Min value is: " + min);
		System.out.println("Second max value is: " + smax);
		System.out.println("Second min value is: " + smin);
	}
}

class Q10SecondMaxMin {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter size of array: ");
		int size = sc.nextInt();
		int arr[] = new int[size];
		System.out.println("Enter " + size + " element: ");

		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}

		int max = arr[0];  // -2147483647
		int min = arr[0];  // 2147483647
		int smax = -2147483647;
		int smin = 2147483647;

		for (int i = 0; i < arr.length; i++) {
			if (max < arr[i]) {
				max = arr[i];
			}
			if (min > arr[i]) {
				min = arr[i];
			}
		}

		// create object:
		MaxMin obj = new MaxMin();
		obj.maxMin(arr, max, min, smax, smin);
	}
}