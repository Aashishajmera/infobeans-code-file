// ==5. Insert element at a specified position of array 
import java.util.Scanner;

/* class Insert{
	// Insert method: 
	public void insert(int arr[] , int insert, int index){
		int count = 0,temp = 0;
		for(int i = 0; i < arr.length+1; i++){
			if(i == index){
				temp = arr[i];
				arr[i] = insert;
				System.out.print(arr[i]+" ");
				count++;
			}else if(i != index && count == 0){
				System.out.print(arr[i] +" ");
			}else if(i != index && count == 1){
				System.out.print(arr[temp] +" ");
				count++;
			}else{
				System.out.print(arr[i-1]+" ");
			}
			
		}
	}
}
class Q5InsertAndNotDlt{
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
		// create object: 
		System.out.println("Inset array element is: ");
		Insert obj = new Insert();
		obj.insert(arr,insert, index);
	}
} */


class Insert{
	// Insert method: 
	public void insert(int arr[] , int insert, int index, int arr2[]){
			for(int i = 0, j = 0; i < arr2.length; i++){
				if(i == index){
					arr2[i] = insert;
					j++;
				}else if(i != index && j == 0){
					arr2[i] = arr[i];
				}else{
					arr2[i] = arr[i-1];
				}
			}
			for(int i = 0; i < arr2.length; i++){
				System.out.print(arr2[i]+" ");
			}
	}
}
class Q5InsertAndNotDlt{
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
		// create new array: 
		int arr2[] = new int[size+1];
		// create object: 
		System.out.println("Inset array element is: ");
		Insert obj = new Insert();
		obj.insert(arr,insert, index, arr2);
	}
}