// 3. Search in element in array (linear and binary)

import java.util.Scanner;
class Q4SearchBinary{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter size of array: ");
		int size = sc.nextInt();
		
		int arr[] = new int[size];
		System.out.println("Enter " +size +" element: ");
		
		// input array element:
		for(int r = 0; r < arr.length; r++){
			arr[r] = sc.nextInt();
		}
		
		// print array element:
		System.out.print("Input array element's is: ");
		for(int r = 0; r < arr.length; r++){
			System.out.print(arr[r]+" ");
		}
		System.out.println();
		
		//assending order 
		System.out.print("Assending order: ");
		for(int r = 0; r < arr.length; r++){
			for(int j = 0; j < arr.length - r -1; j++){
				if(arr[j] > arr[j+1]){
					arr[j] = arr[j] + arr[j+1];
					arr[j+1] = arr[j] - arr[j+1];
					arr[j] = arr[j] - arr[j+1];
				}
			}
		}
		for(int r = 0; r < arr.length; r++){
			System.out.print(arr[r]+" ");
		}
		System.out.println();
		
		// Disending order
		System.out.print("Disending order: ");
		for(int r = 0; r < arr.length; r++){
			for(int j = 0; j < arr.length - r -1; j++){
				if(arr[j] < arr[j+1]){
					arr[j] = arr[j] + arr[j+1];
					arr[j+1] = arr[j] - arr[j+1];
					arr[j] = arr[j] - arr[j+1];
				}
			}
		}
		for(int r = 0; r < arr.length; r++){
			System.out.print(arr[r]+" ");
		}
		
		// Search element 
		System.out.println("Enter search element: ");
		int search = sc.nextInt();
		
		
	}
}