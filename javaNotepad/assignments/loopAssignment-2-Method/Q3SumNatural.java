// 3) WAP to find out the sum of N natural number.

import java.util.Scanner;

class Q3SumNatural{
	
	// create method:
	public void sum(int n){
		int sum = 0; 
		for(int i = 1; i <= n; i++){
			sum += i;
		}
		System.out.println("Entered number sum is: "+sum);
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any natural number: -sum of N natural number.");
		int n = sc.nextInt();
		Q3SumNatural obj = new Q3SumNatural();
		new Q3SumNatural().sum(n);
	}
}