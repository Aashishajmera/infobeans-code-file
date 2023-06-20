// 1. Take values of length and breadth of a rectangle from user and check if it is square or not.

import java.util.Scanner;
class Q1Ractangle{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter length: ");
		int length = sc.nextInt();
		System.out.println("Enter breadth: "); 
		int breadth = sc.nextInt();
		if(length == breadth){
			System.out.println("This is square: ");
		}else{
			System.out.println("Not square: ");
		}
	}
}