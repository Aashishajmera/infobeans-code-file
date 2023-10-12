//	  A
//   AB 
//  ABC
// ABCD 
//ABCDE

package LoopQues;

import java.util.Scanner;

public class Pattern2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number: ");
		int n = scanner.nextInt();
		
		for(int i = 1; i <= n; i++) {
			char c = 65;
			for(int j = 1; j <= n; j++) {
				if(j >= ((n+1) - i)) {
					System.out.print(c);
					c++;
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
