// ==8. Rotate the array by one

import java.util.Scanner;
class Rotate{
	
	// input array: 
	public void inputElement(int arr1[], Scanner sc){
		for(int i = 0; i < arr1.length; i++){
			arr1[i] = sc.nextInt();
		}
	}
	
	
	// output array element: 
	public void printElement(int arr[]){
		System.out.println("Enter array element is: ");
		for(int i = 0; i < arr.length; i++){
			System.out.print(arr[i] +" ");
		}
	}
	
	
	// rotate array for user required:
	public void rotateElement(int arr1[], int arr2[], int size){
		for(int i = 0; i < arr1.length; i++){
			if((size-1) == i){
				arr2[size-1] = arr1[0];
			}else {
				arr2[i] = arr1[i+1];
			}
		}
		
		System.out.println("rotate array is: ");
	for(int i = 0; i < arr2.length; i++){
		System.out.print(arr2[i]+" ");
	}
	}
	
}
class Q8Rotate2{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of array: ");
		int size = sc.nextInt();
		int arr1[] = new int[size];
		int arr2[] = new int[size];
		System.out.println("Enter "+size +" element: ");
		
		// create method:
		Rotate obj = new Rotate();
		obj.inputElement(arr1, sc);
		obj.printElement(arr1);
		// System.out.println("Enter rotate element: ");
		// int element = sc.nextInt();
		obj.rotateElement(arr1, arr2,size);
	}
}