// 4. Sort the array (linear and bubble)

import java.util.Scanner;
class Q4LinerSort{
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
		
		// sort linear assending order: 
		System.out.print("linear Sort: ");
		for(int r = 0; r < arr.length; r++){
			for(int c = 0; c < arr.length-1; c++){
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