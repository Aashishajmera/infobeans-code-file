// 1. WAP sum of array element
import java.util.Scanner;
class A{
	public int sum(int arr[]){
		int sum = 0;
		for(int i = 0; i < arr.length; i++){
			sum += arr[i];
		}
		return sum;
	}
}


class Sum2{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of array: ");
		int size = sc.nextInt();
		
		System.out.println("Enter " +size +" element: ");
		int arr[] = new int[size];
		
		// input array element: 
		for(int i = 0; i < arr.length; i++){
			arr[i] = sc.nextInt();
		}
		
		// create object:
		A obj = new A();
		int result = obj.sum(arr);
		System.out.println("Array element sum is: "+result);
	}
}