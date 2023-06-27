// 49) WAP to find out all the perfect numbers between two entered numbers

import java.util.Scanner;
class Q49PerfectTwoNum{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number: ");
		int f = sc.nextInt();
		System.out.println("Enter second number: ");
		int s = sc.nextInt();
		int store = 0;
		for(int i = f; i <= s; i++){
			for(int j = i; j <= i; j++){
				for(int k = 1; k < i; k++){
					if(j%k == 0){
						store += k;
					}
				}
				if(store == j){
					System.out.println("perfect num is: " +j);
				}
				store = 0;
			}
		}
	}
}