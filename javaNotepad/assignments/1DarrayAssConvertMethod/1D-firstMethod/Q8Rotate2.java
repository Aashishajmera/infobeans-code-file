// ==8. Rotate the array by one
import java.util.Scanner;
class Rotate{
	int s;
	int arr[] = new int[s];
	public void rotate(){
	
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
class Q8Rotate2{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		Rotate obj = new Rotate();
		obj.inputArray(sc);
		obj.printArray();
	}
}