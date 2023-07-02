/// 46) WAP to find out the sum of first and last digit of a user entered number

import java.util.Scanner;
class Q46SumFirstLast{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any natural number: ");
		int n = sc.nextInt();
		int tempp = n;
		int lastDigit= 0, rem = 0, temp=0;
		for(int i = n; n != 0; n = n/10){
			if(i==n){
				lastDigit = n%10;
			}
			rem = n%10;
			temp = n;
		}
		if(tempp <= 10 && tempp >= 1){
			System.out.println(tempp+" this is single digit ");
		}else{
			int sum = lastDigit+temp;
			System.out.println("First and last digit sum is: " +sum);
		}
		
	}
}