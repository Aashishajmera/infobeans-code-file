// 37) WAP to check whether entered number is palindrome or not

import java.util.Scanner;
class Q37Palindrome{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number: ");
		int n = sc.nextInt();
		int lastDigit = 0, rev = 0, temp = n;
		while(n != 0){
			lastDigit = n % 10;
			rev = ((rev * 10) +lastDigit);
			n = n/10;
		}if(temp == rev){
			System.out.println("Entered number is palindrome number: ");
		}else{
			System.out.println("Not palindrome: ");
		}
	}
}