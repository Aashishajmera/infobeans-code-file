// 44) WAP to interchange first and last digit of a number

import java.util.Scanner;
class Q44InterchangeDigit{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number: ");
		int n = sc.nextInt();
		int lastDigit = 0 , firstDigit = 0;
		
		// using while loop
		// int i = n;
		// while(n != 0){
		// 	if(i == n){
		// 		lastDigit = n%10;
		// 	}
		// 	n=n/10;
		// 	firstDigit = n;
			
		// } 
		
		for(int i = n; n != 0; n = n/10){
			if(i == n){
				lastDigit = n%10;
			}
			firstDigit = n;
		}
		System.out.println("last "+lastDigit);
		System.out.println("first " +firstDigit);
	}
}