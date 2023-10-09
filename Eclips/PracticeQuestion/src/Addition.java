import java.util.Scanner;

public class Addition {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Entr num");
		int n = scanner.nextInt();
		System.out.println("Enter second number: ");
		int n2 = scanner.nextInt();
		System.out.println(n+n2);
	}
}
