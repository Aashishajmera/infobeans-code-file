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
		
		//find second max and min 
		
		int min = 2147483647 , SecondMin = 2147483647;
		int max = -2147483647 , SecondMax = -2147483647;
		
		
	}
}