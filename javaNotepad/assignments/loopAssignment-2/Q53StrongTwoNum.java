// 53) WAP to print all the strong numbers between two entered numbers

import java.util.Scanner;
class Q53StrongTwoNum{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number: ");
		int f = sc.nextInt();
		System.out.println("Enter second number: ");
		int s = sc.nextInt();
		int strong = 0;
		for(int i = f; i <= s; i++){
			for(int j = i; j <= i; j++){
				for(int k = 1; k < j; k++){
					if(j%k==0){
						strong += k;
					}
				}if(strong == j){
					System.out.println(strong +" is strong number: ");
				}
				
			}strong = 0;
		}
	}
}