//30) 1+11+111+1111+11111+….

import java.util.Scanner;
class Q30OnlyOneSign{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any positive number: ");
		int n = sc.nextInt();
		int mul = 0, temp = 10;
		for(int i = 1; i <= n; i++){
			mul = ((mul*temp) + 1);
			System.out.print(mul+"+");
		}
	}
}