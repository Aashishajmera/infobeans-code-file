// 21) 1, 4, 9, 16, 25 …..
import java.util.Scanner;
class Q21Squre{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any positive number: ");
		int n = sc.nextInt();
		int i = 1; 
		while(n != 0 && n > 0){
			System.out.println(i+" Squre is: "+(i*i));
			i++; n--;
		}
	}
}