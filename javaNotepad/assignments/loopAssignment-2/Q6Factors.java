// 6) WAP to find out the factors of a number.

import java.util.Scanner;
class Q6Factors{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number: ");
		int n = sc.nextInt();
		for(int i = 1; i <= n; i++){
			if(n%i == 0){
				System.out.println(i +" is factor of " +n);
			}
		}
	}
}