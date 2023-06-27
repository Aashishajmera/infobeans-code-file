// 50) WAP to find out all the palindrome numbers between two entered numbers

import java.util.Scanner;
class Q50PalindromeTwoNum{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number: ");
		int f = sc.nextInt();
		System.out.println("Enter second number: ");
		int s = sc.nextInt();
		int rem = 0, rev = 0,j ;
		for(int i = f; i  <= s; i++){
			for(j = i; j != 0; j = j/10){
				rem = j%10;
				rev = (rev*10) + rem;
				 
			}if(j == rev){
				System.out.println("Palindrom num is: " +rev);
			}
			rev = 0;
			rem = 0;
		}
	}
}