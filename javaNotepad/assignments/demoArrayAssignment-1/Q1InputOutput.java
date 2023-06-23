import java.util.Scanner;
class Q1InputOutput{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		System.out.pirntln("Enter Array of element: ");
		int n = sc.nextInt();
		int arr[] = new int[n]
		System.out.pirntln("Enter " +n +" element: ");
		for(int i = 0; i < n; i++){
			arr[i]=sc.nextInt();  //arr[i] is a index 
		}
		for(int j = 0; j < n; j++){
			System.out.pirntln(arr[i]);  // print index value 
		}
	}
}