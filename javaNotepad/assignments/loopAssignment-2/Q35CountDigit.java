// 35) WAP to count number of digits

import java.util.Scanner;
class Q35CountDigit{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number: ");
		int n = sc.nextInt();
		int rem = 0, count = 0;
		for(; n != 0; n = n/10){
			rem = n%10;
			if(n != 0){
				count++;
			}
			
		}
		System.out.println("You Entered "+count +" number: ");
	}
}