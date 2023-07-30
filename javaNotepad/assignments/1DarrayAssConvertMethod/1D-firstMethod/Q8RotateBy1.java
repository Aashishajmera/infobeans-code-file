import java.util.Scanner;
/* class Rotate{
	int size ;
	int arr[] = new int[size];
	
	// create default constructor
	public Rotate{
		
	}
} */

class Q8RotateBy1{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of array: ");
		int size = sc.nextInt();
		int arr[] = new int[size];
		System.out.println("Enter " +size +" element: ");
		for(int i = 0; i < arr.length; i++){
			arr[i] = sc.nextInt();
		}
		
		System.out.println("real array is: ");
		for(int i: arr){
			System.out.println(i);
		}
		
		System.out.println("rotate array is: ");
		for(int i = 0; i < arr.length; i++){
			
		}
	}
}