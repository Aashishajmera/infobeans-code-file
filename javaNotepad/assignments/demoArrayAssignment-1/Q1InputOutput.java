import java.util.Scanner;
class Q1InputOutput{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Array of length: ");
		int n = sc.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter " +n +" element: ");
		int i,ans = -1;
		for(i = 0; i < n; i++){
			arr[i]=sc.nextInt();  //arr[i] is a index 
		}
		System.out.println("Entered number is: ");
		
		for(i = 0; i < n; i++){
			System.out.println(arr[i]);  // print index value 
		}
		
		System.out.println("Enter find number: ");
		int find = sc.nextInt();
		
		for(i = 0; i < n; i++){
			if(arr[i] == find){
				ans = 1;
			break;
		}
		}
		if(ans == 1){
			System.out.println("Yes you entered " +find +" number: ");
		}else{
			System.out.println("You not entered "+find +" number: ");
		}

	}
}