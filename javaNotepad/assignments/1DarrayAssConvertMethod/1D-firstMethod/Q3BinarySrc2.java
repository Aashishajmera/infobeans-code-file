
// 3. Search in element in array (linear and binary)
import java.util.Scanner;

class Binary {

	// assending
	public int[] assending(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length - i - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					arr[j] = arr[j] + arr[j + 1];
					arr[j + 1] = arr[j] - arr[j + 1];
					arr[j] = arr[j] - arr[j + 1];
				}
			}
		}
		System.out.println("Assending ordar: ");
		return arr;
	}

	// search
	public void search(int arr[], int search) {

		boolean flag = true;
		int low = 0, high = arr.length;
		for (int i = 0; i < arr.length; i++) {
			int mid = (low + high) / 2;
			if (search == arr[mid]) {
				System.out.println("Element found: ");
				flag = false;
				break;
			} else if (search > arr[mid]) {
				low = mid + 1;
			} else {
				high = mid - 1;
			}
		}
		if (flag) {
			System.out.println("not found: ");
		}

	}

}

public class Q3BinarySrc2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of array: ");
		int size = sc.nextInt();
		int arr[] = new int[size];
		System.out.println("Enter " + size + "element: ");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}

		// create object
		Binary obj = new Binary();

		// call assending method:
		int assen[] = obj.assending(arr);
		// print assending order:
		for (int i = 0; i < assen.length; i++) {
			System.out.print(assen[i] + " ");
		}
		System.out.println();

		System.out.println("Enter search element: ");
		int search = sc.nextInt();

		// search method calling:
		obj.search(arr, search);
	}
}