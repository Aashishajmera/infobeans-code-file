import java.util.Scanner;

class FoundArr{
	// instace array: 
	int arr[], n ;
	
	//create default constructor:
	public FoundArr(){
		
	}
	
	// create  constructor:
	public FoundArr(int arr[], int size){
		this.arr = arr;
		this.n  = size;
	}
	
	// input array element method:
	public void input(Scanner sc){
		System.out.println("Enter "+n +" element: ");
		for(int i = 0; i < arr.length; i++){
			arr[i] = sc.nextInt();
		}
	}
	
	// print array element:
	public void output(){
		System.out.println("Enter array element is: ");
		for(int i = 0; i < arr.length; i++){
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	
	// find element:
	public void found(Scanner sc){
		int k = 0;
		System.out.println("Enter found element: ");
		int found = sc.nextInt();
		for(int i = 0; i < arr.length; i++){
			if(arr[i] == found){
				System.out.println("Found element: ");
				k++;
				break;
			}
		}if(k == 0){
			System.out.println("Not found: ");
		}
	}
}

class Q3FoundEle{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of array: ");
		int size = sc.nextInt();
		int arr[] = new int[size];
		
		// create object:
		FoundArr obj = new FoundArr(arr, size);
		
		// call input method:
		obj.input(sc);
		obj.output();
		obj.found(sc);
		
		

	}
}