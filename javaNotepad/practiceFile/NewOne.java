/*
1
2 11
3 10 12
4 9 13 18
5 8 14 17 19
6 7 15 16 20 21 */

import java.util.Scanner;
class NewOne{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter row: ");
		int n = sc.nextInt();
		
		for(int  r = 1; r <= n; r++){
			System.out.print(r +" ");
			int val = r;
			for(int c = 1; c < r; c++){
				val = (c%2 != 0) ?val+((2*(n+1-r))-1):val+(2*(r-c));
				System.out.print( val + " ");
			}
			System.out.println();
		}
	}
}