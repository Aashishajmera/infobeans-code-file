// 9. Find max & min element in array 

import java.util.Scanner;
class Q9MaxMin{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter size of array: ");
		int size = sc.nextInt();
		int arr[] = new int[size];
		int max = arr[0];
		int min = arr.length-1;
		System.out.println("Enter " +size +" element: ");
		for(int r = 0; r < arr.length; r++){
			arr[r] = sc.nextInt();
		}
		
		//max value 
		for(int r = 0; r < arr.length; r++){
			if(max < arr[r]){
				max = arr[r];
			}
			
			if(min > arr[r]){
				min = arr[r];
			}
		}
		System.out.print("Max value is: " +max +"\n");
		
		
		
		System.out.print("Min value is: "+min);
	}
}