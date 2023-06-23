// 40) WAP to count no. Of even and odd digits in a number

import java.util.Scanner;
class Q40CountEvenOdd{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number: ");
		int n = sc.nextInt();
		int even = 0, odd = 0;
		for(int i = 1; i <= n; i++){
			if(i%2 == 0){
				even++;
			}else{
				odd++;
			}
		}
		System.out.println("Total even number is: " +even);
		System.out.println("Total odd number is: " +odd);
	}
}