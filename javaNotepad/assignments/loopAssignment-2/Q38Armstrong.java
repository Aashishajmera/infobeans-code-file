// 38) WAP to check whether entered number is Armstrong or not

import java.util.Scanner;
class Q38Armstrong{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number: ");
		int n = sc.nextInt();
		int lastDigit = 0, rev = 0, temp = n;
		while(n!=0){
			lastDigit = n %10;
			rev += (lastDigit * lastDigit * lastDigit);
			n = n / 10;
		}if(rev == temp){
			System.out.println("Entered number is armstron: ");
		}else{
			System.out.println("Not armstron: ");
		}
	}
}