// ===6. Delete the element froam an array 
import java.util.Scanner;
class DeleteElement{
	
	
	//input element:
	public void inputElement(Scanner sc,int arr[]){
		for(int i = 0; i < arr.length; i++){
			arr[i] = sc.nextInt();
		}
	}
	
	
	// print element:
	public void printElement(int arr[]){
		for(int i = 0; i < arr.length; i++){
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	
	
	public void deleteElement(int delete, int arr[],int size){
		int count = 0;
		for(int i = 0; i < arr.length; i++){
			if(arr[i] == delete){
				size--;
				break;
			}
		}
		
		for(int i = 0; i < arr.length; i++){
		
			if(delete == arr[i]){
				arr[i] = arr[i+1];
				count++;
				// System.out.print(arr[i]+" ");
			}else if(delete != arr[i] && count == 0){
				// System.out.print(arr[i]+" ");
				arr[i] = arr[i];
			}else{
				// System.out.print(arr[i+1]+" ");
				arr[i]=arr[i+1];
			}
		}
		//print array: 
		for(int i = 0; i < arr.length; i++){
			System.out.print(arr[i] +" ");
		}
	}
}
class Q6DeleteElement2{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		//input array element:
		System.out.println("Enter size of array: ");
		int size = sc.nextInt();
		int arr[] = new int[size];
		System.out.println("Enter " +size +" element: ");
		//create object:
		DeleteElement obj = new DeleteElement();
		// call input element:
		obj.inputElement(sc, arr);
		// call print element:
		System.out.println("Input array is: ");
		obj.printElement(arr);
		//input delete element:
		System.out.println("Enter delete element: ");
		int delete = sc.nextInt();
		//calling delete method:
		obj.deleteElement(delete, arr, size);
		
		
	}
}