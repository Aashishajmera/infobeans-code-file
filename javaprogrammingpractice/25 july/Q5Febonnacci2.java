import java.util.Scanner;
class Febonnacci{
	public void febonacci(int n){
		int a = 0, b = 1, c = 0;
		for(int i = 1; i <= n; i++){
			a = b; 
			System.out.print(c+" ");
			b = c; 
			c = a+b;
		}
	}
}

class Q5Febonnacci2{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number: ");
		int n = sc.nextInt();
		
		Febonnacci obj = new Febonnacci();
		obj.febonacci(n);
	}
}