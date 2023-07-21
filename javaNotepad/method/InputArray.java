import java.util.Scanner;

class A{
	public void inputArray(int arr[],Scanner sc){
		// input array element:
		for(int i = 0; i < arr.length; i++){
			arr[i] = sc.nextInt();
		}
		System.out.println("Enter element is: ");
		// print array element:
		for(int j = 0; j < arr.length; j++){
			System.out.println(arr[j]);
		}
		
	}
}

class InputArray{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of array: ");
		int size = sc.nextInt();
		int arr[] = new int[size];
		System.out.println("Enter " +size +" element: ");
		A obj = new A();
		obj.inputArray(arr,sc);
		
	}
}