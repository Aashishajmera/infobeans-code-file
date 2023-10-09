import java.util.Scanner;

public class WithoutLoopPrint {
	public static void printValue(int n) {
//		if(n == 0) {
//			return ;
//		}
//		
//		printValue(n-1);
//		System.out.println(n);
		
		if(n != 0){
			System.out.println();
		}
		
		if(n > 0) {
			printValue(n);
		}
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number: ");
		int n = scanner.nextInt();
		
		WithoutLoopPrint.printValue(n);
	}
}
