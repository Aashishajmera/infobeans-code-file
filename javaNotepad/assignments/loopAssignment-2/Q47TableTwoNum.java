// 47) WAP to print tables of all the numbers between two entered numbers

import java.util.Scanner;
class Q47TableTwoNum{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number: ");
		int f = sc.nextInt();
		System.out.println("Enter second number: ");
		int s = sc.nextInt();
		for(int i = f; i <= s; i++){
			for(int j = i; j <= i; j++){
				for(int k = 1; k <= 10; k++){
					System.out.println(j+"* "+k +" =" +(j*k));
				}
			}
		}
	}
}