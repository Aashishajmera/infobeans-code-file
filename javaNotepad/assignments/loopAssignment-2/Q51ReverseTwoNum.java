// 51) WAP to reverse all the numbers between two entered numbers

import java.util.Scanner;
class Q51ReverseTwoNum{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number: ");
		int f = sc.nextInt();
		System.out.println("Enter second number: ");
		int s = sc.nextInt();
		int rem = 0, rev = 0;
		for(int i = f; i <= s; i++){
			for(int j = i; j!=0; j = j/10){
				rem = j%10;
				rev = rev*10 + rem;
			}System.out.println(rev);
			rev = 0;
			rem = 0;
		}
	}
}