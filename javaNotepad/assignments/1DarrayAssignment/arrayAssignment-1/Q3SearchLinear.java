// 3. Search in element in array (linear and binary)

import java.util.Scanner;
class Q3SearchLinear{
	 public static void main(String[] args){
		boolean flag = false;
		// int index = 0;
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
		int r = 0;
		for( r = 0; r < arr.length; r++){
			if(search == arr[r]){
				flag = true;
				// index = r;
				break;
			}
		}
		if(flag){
			System.out.println("Element "+arr[r] +" found & index is: "+r);
		}else{
			System.out.println("Not found: ");
		}
	}
}