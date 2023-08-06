// 10. Find the 2nd max & 2nd min element

import java.util.Scanner;
class Q10SecondMaxMin{
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
		
		int min = arr[0], SecondMin = 2147483647;
		int max = arr[0] , SecondMax = 2147483647;
		
		// find first max and min: 
		for(int i = 0; i < arr.length; i++){
			if(min > arr[i]){
				min = arr[i];
			}
			if(max < arr[i]){
				max = arr[i];
			}
		}
		
				System.out.println("Max is: "+max);
		System.out.println("Min is: "+min);

		//find second max and min 
		
		for(int i = 0; i < arr.length; i++){
			if(min < arr[i]){
				SecondMax = min;
				min = arr[i];
			}
			if(max > arr[i]){
				SecondMin = max;
				max = arr[i];
			}
		}
		System.out.println("Second Max is: "+SecondMax);
		System.out.println("Second min is: "+SecondMin);

	}
}