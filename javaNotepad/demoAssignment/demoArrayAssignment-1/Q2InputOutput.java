// 2 wap to ask 5 names from user and check if particular name exists in array or not .

import java.util.Scanner;
class Q2InputOutput{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		// System.out.println("Enter size of array: ");
		// int n = sc.nextInt();
		int arr[] = new int[5];
		System.out.println("Enter " +5 +" element: ");
		int i,ans = -1;
		
		for(i = 0; i < 5; i++){
			arr[i]=sc.nextInt();  //arr[i] is a index 
		}
		System.out.println("Entered number is: ");
		
		for(i = 0; i < 5; i++){
			System.out.println(arr[i]);  // print index value 
		}
		
		System.out.println("Enter find number: ");
		int find = sc.nextInt();
		
		for(i = 0; i < 5; i++){
			if(arr[i] == find){
				ans = 1;
			break;
		}
		}
		if(ans == 1){
			System.out.println("Yes you entered " +find +" number: ");
		}else{
			System.out.println("You not entered "+find +" number: ");
		}
	}
}