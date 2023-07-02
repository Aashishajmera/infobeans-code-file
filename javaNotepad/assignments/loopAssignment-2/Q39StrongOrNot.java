// 39) WAP to check whether entered number is strong or not

import java.util.Scanner;
class Q39StrongOrNot{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number: ");
		int n = sc.nextInt();
		int sum = 0;
		for(int i = 1; i < n; i++){
			if(n%i == 0){
				sum += i;
			}
		}if(sum == n){
			System.out.println(n+" is strong number: ");
		}else{
			System.out.println(n +" is not a strong number: ");
		}
	}
}