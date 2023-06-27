// 48) WAP to find out the factors of all the numbers between two entered numbers

import java.util.Scanner;
class Q48FactorsTwoNum{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number: ");
		int f = sc.nextInt();
		System.out.println("Enter second number: ");
		int s = sc.nextInt();
		int mul = 1;
		for(int i = f; i <= s; i++){
			for(int j = i; j >= 2; j--){
				mul *= j;
			}
			System.out.println("Factors is: " +mul);
			mul = 1;
		}
	}
}