// 57) WAP to print all the prime numbers between two entered numbers

import java.util.Scanner;
class Q57PrimeTwoNum{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number: ");
		int f = sc.nextInt();
		System.out.println("Enter second number: ");
		int s = sc.nextInt();
		
		// boolean flag = true;
		// for(int i = f; i <= s; i++){
			// for(int j = 2; j < i; j++){
				// if(i%j == 0){
					// flag = false; 
				// }
			// }if(flag==false){
				// // System.out.println(i +"prime number: ");
			// }else{
				// System.out.println(i +"prime number: ");
			// }
		// }
		
		// int count = 0;
		for(int i = f; i <=s; i++){
			int count = 0;
			for(int j = 2; j <= i/2; j++){
				if(i%j == 0){
					count++;
				}
			}if(count == 0 && i != 1){
				System.out.print(i+" ");
			}
		}
	}
}