// 2. Sum of even and odd element 

import java.util.Scanner;
class A{
	public void evenOdd(int arr[]){
		int even = 0, odd = 0;
		for(int i = 0; i < arr.length; i++){
			if(arr[i]%2 == 0){
				even += arr[i];
			}else{
				odd+=arr[i];
			}
		}
		System.out.println("Even number sum is: "+even);
		System.out.println("Odd number sum is: "+odd);
	}
}
class EvenOdd2{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of array: ");
		int size = sc.nextInt();
		
		int arr[] = new int[size];
		System.out.println("Enter " +size +" element: ");
		
		for(int i = 0; i < arr.length; i++){
			arr[i] = sc.nextInt();
		}
		
		A obj = new A();
		obj.evenOdd(arr);
		
	}
}