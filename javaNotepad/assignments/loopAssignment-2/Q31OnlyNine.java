// 31) 9 99 999 9999 99999 …….

import java.util.Scanner;
class Q31OnlyNine{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any positive number: ");
		int n = sc.nextInt();
		int mul = 0, temp = 10;
		for(int i = n; i >= 1; i--){
			mul = ((mul * temp)+9);
			System.out.print(mul+" ");
		}
	}
}