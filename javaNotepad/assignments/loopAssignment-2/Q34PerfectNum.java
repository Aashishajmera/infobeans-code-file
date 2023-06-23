// 34) WAP to check whether entered number is perfect or not

import java.util.Scanner;
class Q34PerfectNum{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any positive number: ");
		int n = sc.nextInt();
		int temp = 0;
		for(int i = 1; i < n; i++){
			if(n%i == 0){
				temp += i; 
			}
		}if(temp == n){
			System.out.println("Entered number is perfect: ");
		}else{
			System.out.println("Entered number is not perfect number: ");
		}
	}
}