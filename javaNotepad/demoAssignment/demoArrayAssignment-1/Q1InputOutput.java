// 1 wap to define an array of integer of size 6 .Take input from user and display it in reverse order

import java.util.Scanner;
class Q1InputOutput{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		// System.out.println("Enter Array of length: ");
		// int n = sc.nextInt();
		int arr[] = new int[6];
		System.out.println("Enter " +6 +" element: ");
		int i,ans = -1;
		for(i = 0; i < arr.length; i++){
			arr[i]=sc.nextInt();  //arr[i] is a index 
		}
		System.out.println("Entered number is: ");
		
		for(i = 0; i < arr.length; i++){
			System.out.println(arr[i]);  // print index value 
		}
		
	}
}