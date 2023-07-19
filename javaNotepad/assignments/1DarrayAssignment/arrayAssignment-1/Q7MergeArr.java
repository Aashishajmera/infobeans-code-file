// 7. Merge two array

import java.util.Scanner;
class Q7MergeArr{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first array size: ");
		int size1 = sc.nextInt();
		int arr1[] = new int[size1];
		System.out.println("Enter " +size1 +" element: ");
		for(int r = 0; r < arr1.length; r++){
			arr1[r] = sc.nextInt();
		}
		
		System.out.println("Enter second array size:");
		int size2 = sc.nextInt();
		int arr2[] = new int[size2];
		System.out.println("Enter " +size2 +" element: ");
		for(int r = 0; r < arr2.length; r++){
			arr2[r] = sc.nextInt();
		}
		
		// merge two array
		
		int arr3[] = new int[size1+size2];
		int j = arr1.length;
		
		for(int i = 0; i < arr1.length; i++){
			arr3[i]= arr1[i];
		}
		for(int i = 0; i < arr2.length; i++){
			arr3[j] = arr2[i];
			j++;
		}
		System.out.print("Merge array is: ");
		for(int r = 0; r < arr3.length; r++){
			System.out.print(arr3[r]+" ");
		}
	}
}