// ==8. InputArr the array by method:
import java.util.Scanner;
class InputArr{
	int s;
	int arr[] = new int[s];
	
	//default constructor: 
	public InputArr(){
	
	}
	
	
	// input array: 
	public void inputArray(Scanner sc){
		System.out.println("Enter size of array: ");
		int size = sc.nextInt();
		// this.s = size;
		int arr[] = new int[size];
		this.arr = arr;
		System.out.println("Enter " +size +" element: ");
		for(int i = 0; i < size; i++){
			this.arr[i] = sc.nextInt();
		}
	}
	
	
	// output array element: 
	public void printArray(){
		for(int i = 0; i < arr.length; i++){
			System.out.print(arr[i] +" ");
		}
	}
}
class InputArrayMethod{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		InputArr obj = new InputArr();
		obj.inputArray(sc);
		System.out.println("Enter array element is: ");
		obj.printArray();
	}
}