// 3. Search in element in array (Linear)

import java.util.Scanner;
class Q3SearchLinear{
	 public static void main(String[] args){
	/*	boolean flag = false;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter size of array: ");
		int n = sc.nextInt();
		int arr[] = new int[n];
		
		int i ;
		for(i = 0; i < arr.length; i++){
			System.out.println("Enter " +(i+1) +" element");
			arr[i] = sc.nextInt();
		}
		
		System.out.print("Enter search element: ");
		int search = sc.nextInt();
		
		int j = 0;
		for(j = 0; j < arr.length; j++){
			if(arr[j] == search){
				flag = true;
				break;
			}
		}
		
		if(flag){
			System.out.println("Found element "+(arr[j]) +" & index is: " +j);
		}else{
			System.out.println("Not found: ");
		} */
		
		boolean flag = false;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of array: ");
		int n = sc.nextInt();
		int arr[] = new int[n];

		for(int r = 0; r < arr.length; r++){
			System.out.println("Enter "+(r+1) +" element: ");
			arr[r] = sc.nextInt();
		}
		
		System.out.println("Enter search element: ");
		int search = sc.nextInt();
		
		for(int r = 0; r < arr.length; r++){
			if(search == arr[r]){
				flag = true;
				break;
			}
		}
		if(flag){
			System.out.println("Found element: ");
		}else{
			System.out.println("Not found: ");
		}
	}
}