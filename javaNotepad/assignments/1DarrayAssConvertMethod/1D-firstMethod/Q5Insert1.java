// ==5. Insert element at a specified position of array 
import java.util.Scanner;

class Insert{
	// Insert method: 
	public void insert(int arr[] , int insert , int index){
		for(int i = 0; i < arr.length; i++){
			if(i == index){
				arr[i] = insert;
			}
			System.out.print(arr[i]+" ");
		}
	}
}
class Q5Insert1{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of array: ");
		int size = sc.nextInt();
		
		int arr[] = new int[size];
		// input array element: 
		System.out.println("Enter " +size +" element: ");
		for(int i = 0; i < arr.length; i++){
			arr[i] = sc.nextInt();
		}
		//input insert position:
		System.out.println("Enter insert position beetwen 0 to "+(size-1));
		int index = sc.nextInt();
		// input insert element:
		System.out.println("Enter insert element: ");
		int insert = sc.nextInt();
		// create method: 
		System.out.println("Inset array element is: ");
		Insert obj = new Insert();
		obj.insert(arr,insert,index);
	}
}