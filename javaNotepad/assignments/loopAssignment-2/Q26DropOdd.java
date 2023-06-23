// 26) 0 8 64 216 …………

import java.util.Scanner;
class Q26DropOdd{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any Positive number: ");
		int n = sc.nextInt();
		for(int i = 0; i <= n*2; i++){
			if(i%2 == 0){
				System.out.println(i*i*i);
			}
		}
	}
}