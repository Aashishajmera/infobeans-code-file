import java.util.Scanner;

public class WithOutModul {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number: ");
		int n = scanner.nextInt();
		if(n < 0) {
			n = -n;
		}
		if(((n/2)*2)+1 == n) {
			System.out.println("Odd");
		}else {
			System.out.println("Even");
		}
	}
}
