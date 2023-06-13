import java.util.Scanner;

public class Q8Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number: (febonacci series)");
        int n = sc.nextInt();
        int i = 1, a = 0, b = 1, sum = 0;
        // System.out.println("0");
        // System.out.println("1");
        while (i <= n) {
            System.out.println(sum);

            a = b;
            b = sum;
            sum = a + b;

            i++;
        }
    }
}