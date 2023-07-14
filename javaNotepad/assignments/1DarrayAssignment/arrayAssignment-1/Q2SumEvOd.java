// 2. Sum of even and odd element 

import java.util.Scanner;
class Q2SumEvOd{
	public static void main(String[] args){
		int even = 0, odd = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of array: ");
		int n = sc.nextInt();
		int[] x = new int[n];
		System.out.println("Enter " +n +" element");
		for(int i = 0; i < x.length; i++){
			x[i] = sc.nextInt();
		}
		for(int j = 0; j < x.length; j++){
			if(x[j] % 2 == 0){
				even += x[j];
			}else{
				odd += x[j];
			}
		}
		System.out.println("Even element sum is: "+even);
		System.out.println("Odd element sum is: "+odd);
	}
}