// 56) WAP to print factorial of all the numbers between two entered numbers

import java.util.Scanner;
class Q56FactorialTwoNum{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number: ");
		int f = sc.nextInt();
		System.out.println("Enter second number: ");
		int s = sc.nextInt();
		
		// fibonacci series
		// int a = 0, b = 1, c = 0;
		// for(int i = 1; i <= s; i++){
			// if(i >= f){
			// System.out.println(c);
			// }
			// a = b;
			// b = c;
			// c = a+b;
		// }
		
		int i,j;
		for(i = f; i <= s; i++){
			int fact = 1;
			for(j = i; j >= 2; j--){
				fact *= j;
			}System.out.println(i +" Factorial is : " +fact);
		}
	}
}