// 23) 1 9 25 49 81 …..
import java.util.Scanner;
class Q23DropOneByOne{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any positive number: ");
		int n = sc.nextInt();
		for(int i = 1; i <= n*2; i++){
			if(i%2 != 0){
				System.out.println(i*i);
			}
		}
	}
}