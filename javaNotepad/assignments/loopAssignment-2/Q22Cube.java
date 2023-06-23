// 22) 1 8 27 64 125 …..
import java.util.Scanner;
class Q22Cube{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any positive number: ");
		int n = sc.nextInt();
		for(int i = 1; i <= n; i++){
			System.out.println(i +" Cube is: " +(i*i*i));
		}
	}
}