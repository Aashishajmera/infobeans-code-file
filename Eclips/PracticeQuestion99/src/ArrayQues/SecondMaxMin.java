package ArrayQues;

import java.util.Scanner;

public class SecondMaxMin {
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
		int smax = -2147483648, smin = 2147483647;

		for(int i = 0; i < arr.length; i++) {
			if(arr[i] < min) {
				smin = min ;
				min = arr[i];
			}else if(arr[i] < smin && min != arr[i]) {
				smin = arr[i];
			}
			
			if(arr[i] > max) {
				smax = max;
				max = arr[i];
			}else if(arr[i] > smax && max != arr[i]) {
				smax = arr[i];
			}
			
		}
		System.out.println("Min value : "+min);
		System.out.println("Second min value: "+smin);
		System.out.println("Max value : "+max);
		System.out.println("Second max value: "+smax);
	}
}
