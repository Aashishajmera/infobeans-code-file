// 36) WAP to reverse a number

import java.util.Scanner;
class Q36ReverseNum{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any Number: ");
		int n = sc.nextInt();
		int lastDigit = 0, rev = 0;
		for(; n != 0; n = n/10){
			lastDigit = n % 10;
			rev = rev * 10 + lastDigit;
		}
		System.out.println("Reverse number is: " +rev);
	}
}