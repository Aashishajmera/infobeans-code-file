// 54) WAP to print all the even numbers between two entered numbers

import java.util.Scanner;
class Q54EvenTwoNum{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number: ");
		int f = sc.nextInt();
		System.out.println("Enter second number: ");
		int s = sc.nextInt();
		
		for(int i = f; i <= s; i++){
			if(i%2 == 0){
				System.out.println(i+" is even number: ");
			}
		}
	}
}