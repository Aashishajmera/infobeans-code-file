import java.text.BreakIterator;
import java.util.Scanner;

public class WithOutMul {
	public static void multiply(int n1, int n2) {
//		if(n1 == 0) {
//			return ;
////			break;
//		}else {
//			mul += n2;
//			n1--;
//		}
//		multiply(n1, n2, mul);
//		System.out.println(mul);
		
		if (n2 == 0) {
			return;
		}
		mul += n1;
		multiply(n1, n2 - 1);
	}

	static int mul = 0;

	public static void main(String... args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter first number:");
		int n1 = scanner.nextInt();
		System.out.println("Enter second number: ");
		int n2 = scanner.nextInt();
		multiply(n1, n2);
		System.out.println("ans = " + mul);
	}
}
