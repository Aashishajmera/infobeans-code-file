//ABCDE 
// A__D 
//  A_C 
//   AB 
//    A

package LoopQues;

import java.util.Scanner;

public class Pattern3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number: ");
		int n = scanner.nextInt();

		for (int i = 1; i <= n; i++) {
			char c = 65;
			for (int j = 1; j <= n; j++) {
				if (j >= i) {
					if(j == i || j == n || i == 1) {
						System.out.print(c);
					}else {
						System.out.print("_");
					}
					c++;
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();

		}
	}
}
