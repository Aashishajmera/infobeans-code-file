// 40)
// * 
// ** 
// **** 
// ******* 
// *********** 

import java.util.Scanner;
class Pt40{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number: ");
		int z = sc.nextInt();
		int k = 1, n = 0;
		for(int r = 1; r <= z; r++){
			k += n;
			n++;
			for(int c = 1; c <= k; c++){
				System.out.print("*");
			}
			System.out.println();
		}
	}
}