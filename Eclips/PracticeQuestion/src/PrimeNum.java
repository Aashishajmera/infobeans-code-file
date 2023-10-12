import java.util.Scanner;

public class PrimeNum {
	public static void main(String[] args) {
		System.out.println("Enter any number: ");
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		boolean flag = true;
		for(int i = 2; i < n/2; i++) {
			if(n%i == 0) {
				flag = false;
				break;
			}
		}
		if(flag && n > 1) {
			System.out.println("prime");
		}else {
			System.out.println("Not prime");
		}
	}
}
