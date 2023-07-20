// 2) WAP to print N natural number.

import java.util.Scanner;
class Q2NaturalNum{
	// create methods:
	public void naturalN(int n){
		for(int i = 1; i <= n; i++){
			System.out.print(i+" ");
		}
	}
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any natural number: ");
		int n = sc.nextInt();
	
		// create object: 
		Q2NaturalNum obj = new Q2NaturalNum();
		obj.naturalN(n);
	}
}
