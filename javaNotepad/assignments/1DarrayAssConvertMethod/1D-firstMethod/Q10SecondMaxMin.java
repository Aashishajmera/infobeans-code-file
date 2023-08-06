// ===10. Find the 2nd max & 2nd min element

import java.util.Scanner;

class MaxMin {
	public void maxMin(int arr[], int max, int min){
		int min2 = 2147483647  , max2 = 2147483647 ;
		for(int i = 0; i < arr.length; i++){
			if(min < arr[i]){
				max2 = min;
				min = arr[i];
			}
			if(max > arr[i]){
				min2 = max;
				max = arr[i];
			}
		}
		System.out.println("2nd max "+max2);
		System.out.println("2nd min "+min2);
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

		int max = arr[0];
		int min  = arr[0];

		for(int i = 0; i < arr.length; i++){
			if(max < arr[i]){
				max = arr[i];
			}
			if(min > arr[i]){
				min = arr[i];
			}
		}

		System.out.println("Max value is: "+max);
		System.out.println("Min value is: "+min);


		// create object:
		MaxMin obj = new MaxMin();
		obj.maxMin(arr, max, min);
	}
}