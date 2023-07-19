// 6. Delete the element froam an array 

import java.util.Scanner;
class Q6DeleteEle{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array size: ");
		int size = sc.nextInt();
		int arr[] = new int[size];
		System.out.println("Enter " +size +" element: ");
		for(int r = 0; r < arr.length; r++){
			arr[r] = sc.nextInt();
		}
		
		System.out.println("Enter delete element: ");
		int delete = sc.nextInt();
		for(int r = 0; r < arr.length; r++){
			if(delete == arr[r]){
				
			}else{
				System.out.println("Not found element " +delete);
			}
		}
	}
}