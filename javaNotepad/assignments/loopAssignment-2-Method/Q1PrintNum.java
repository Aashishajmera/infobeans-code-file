// 1) WAP to print a statement 1000 number of times.

import java.util.Scanner;
class Q1PrintNum{
	
	public void statement(String n){
		for(int i = 1; i <= 1000; i++){
			System.out.println(n);
		}
	}
	
	// Main method
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number: Question-WAP to print a statement 1000 number of times.");
		String n = sc.nextLine();
		Q1PrintNum obj = new Q1PrintNum();
		obj.statement(n);
	}
}