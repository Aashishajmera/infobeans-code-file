// 4. Sort the array (bubble & selection sort)
import java.util.Scanner;

class Bubble{
	// ascending  
	public int[] ascending (int arr[]){
		for(int i = 0; i < arr.length; i++){
			for(int j = 0; j < arr.length -i -1; j++){
				if(arr[j] > arr[j+1]){
					arr[j] = arr[j] + arr[j+1];
					arr[j+1] = arr[j] - arr[j+1];
					arr[j] = arr[j] - arr[j+1];
				}
			}
		}
		return arr;
	}
	
	// descending 
	public int[] descending (int arr[]){
		for(int i = 0; i < arr.length; i++){
			for(int j = 0; j < arr.length -i -1; j++){
				if(arr[j] < arr[j+1]){
					arr[j] = arr[j] + arr[j+1];
					arr[j+1] = arr[j] - arr[j+1];
					arr[j] = arr[j] - arr[j+1];
				}
			}
		}
		return arr;
	}
}
class Q4BubbleSort2{
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
		
		//create object:
		Bubble obj = new Bubble();
		// calling ascending  method: 
		int result[] = obj.ascending (arr);
		// return value print: 
		System.out.println("Bubble sort ascending  order: ");
		for(int i = 0; i < result.length; i++){
			System.out.print(result[i]+" ");
		}
		System.out.println();
		// return value print descending  method:
		System.out.println("Bubble sort descending order: ");
		int des[] = obj.descending(arr);
		for(int i = 0; i < des.length; i++){
			System.out.print(des[i] +" ");
		}
	}
}