
// 9. Find max & min element in array 
import java.util.Scanner;

class MaxMin {
	// find max value method:
	public void max(int arr[]) {
		int max = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (max < arr[i]) {
				max = arr[i];
			}
		}
		System.out.println("Max element is: " + max);
	}

	// find min value method:
	public void min(int arr[]) {
		int min = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (min > arr[i]) {
				min = arr[i];
			}
		}
		System.out.println("Min value is: " + min);
	}
}

class Q9MaxMin2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of array: ");
		int size = sc.nextInt();
		// create array:
		int arr[] = new int[size];
		// input array element:
		System.out.println("Enter " + size + " element: ");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}

		// create object:
		MaxMin obj = new MaxMin();
		obj.max(arr);
		obj.min(arr);
	}
}