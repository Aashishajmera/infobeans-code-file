package ArrayQues;

import java.util.Scanner;

public class MaxMin {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter size of array: ");
		int size = scanner.nextInt();
		
		int arr[] = new int[size];
		System.out.println("Enter "+size +" element: ");
		for(int i = 0; i < arr.length; i++) {
			arr[i] = scanner.nextInt();
		}
		
		int max = -2147483648, min = 2147483647;
		
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] <= min) {
				min = arr[i];
			}else {
				max = arr[i];
			}
		}
		System.out.println("Max value is: "+max);
		System.out.println("Min value is: "+min);
	}
}
