//1. WAP sum of array element 

package ArrayQues;

import java.util.Scanner;

public class Q1Sum {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter array size: ");
		int size = scanner.nextInt();
		System.out.println("Enter "+size +" element: ");
		
		int arr[] = new int[size];
		// create object of method; 
		Methods methods = new Methods();
		
		methods.takeInput(arr, scanner);
		
		int sum = 0;
		for(int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		
		System.out.println("Total sum is: "+sum);
	}
}
