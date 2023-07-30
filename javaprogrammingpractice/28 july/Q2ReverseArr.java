import java.util.Scanner;
class Reverse{
	public void input(int arr[], Scanner sc){
		System.out.println("Enter 6 element: ");
		for(int i = 0; i < arr.length; i++){
			arr[i] = sc.nextInt();
		}
	}
	
	public void reverseArr(int arr1[]){
		for(int i = arr1.length-1; i >= 0; i--){
			System.out.print(arr1[i]+" ");
		}
	}
}
class Q2ReverseArr{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[6];
		
		Reverse obj = new Reverse();
		obj.input(arr, sc);
		System.out.println("Reverse array element is: ");
		obj.reverseArr(arr);

		
	}
}