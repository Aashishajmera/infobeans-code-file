// 4. Sort the array (Selection and bubble)

import java.util.Scanner;
class Q4BubbleSort{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of array: ");
		int size = sc.nextInt();
		
		// create array
		int arr[] = new int[size];
		System.out.println("Enter " +size +" element: ");
		
		// input element: 
		for(int r = 0; r < arr.length; r++){
			arr[r] = sc.nextInt();
		}
		
		// sort Bubble assending order: 
		System.out.print("bubble Sort: ");
		for(int r = 0; r < arr.length; r++){
			for(int c = 0; c < arr.length-r-1; c++){
				if(arr[c] > arr[c+1]){
					arr[c] = arr[c] + arr[c+1];
					arr[c+1] = arr[c] - arr[c+1];
					arr[c] = arr[c] - arr[c+1];
				}
			}
		}
		for(int r = 0; r < arr.length; r++){
			System.out.print(arr[r]+" ");
		}
	}
}