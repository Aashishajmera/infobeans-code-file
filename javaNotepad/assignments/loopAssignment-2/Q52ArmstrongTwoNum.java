// 52) WAP to find out all the Armstrong numbers between two entered numbers

import java.util.Scanner;
class Q52ArmstrongTwoNum{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number: ");
		int f = sc.nextInt();
		System.out.println("Enter second number: ");
		int s = sc.nextInt();
		int lastDigit = 0;
		for(int i = f; i <= s; i++){
			int arm = 0;
			for(int j = i; j != 0; j = j/10){
				lastDigit = j%10;
				arm += (lastDigit*lastDigit*lastDigit);
			}
			if(arm == i){
				System.out.println(i+" is armstrong num: ");
			}
		}
	}
}
