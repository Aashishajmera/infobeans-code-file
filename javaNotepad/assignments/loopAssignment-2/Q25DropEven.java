// 25) 1 27 125 343 …………

import java.util.Scanner;
class Q25DropEven{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any positive number: ");
		int n = sc.nextInt();
		for(int i = 1; i <= n*2; i++){
			if(i%2 != 0){
				System.out.println(i*i*i);
			}
		}
	}
}