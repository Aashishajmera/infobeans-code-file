// 48) WAP to find out the factors of all the numbers between two entered numbers

import java.util.Scanner;
class Q48FactorsTwoNum{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number: ");
		int f = sc.nextInt();
		System.out.println("Enter second number: ");
		int s = sc.nextInt();
		for(int i = f; i <= s; i++){
			System.out.print("Factor of " +i+" is: ");
			for(int j = 1; j <= i; j++){
				if(i%j == 0){
					System.out.print(j+" ");
				}
			}System.out.println();
		}
	}
}