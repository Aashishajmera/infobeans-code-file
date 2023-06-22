import java.util.Scanner;

public class Q8FibonacciSer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any positive number: ");
        int n = sc.nextInt();
        int a = 0, b = 1, sum = 0;
        for (int i = 1; i <= n; i++) {
            a = b;
            b = sum;
            System.out.println(sum);
            sum = a + b;
        }
    }
}
