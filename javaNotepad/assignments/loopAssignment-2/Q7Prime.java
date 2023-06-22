import java.util.Scanner;

public class Q7Prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any natural num:");
        int n = sc.nextInt();
        // int i = 2;
        // int count = 0;
        // while (i < n) {
        // if (n % i == 0) {
        // count++;
        // }
        // i++;
        // }
        // if (count >= 1 && n >= 1) {
        // System.out.println("Not prime");
        // }
        // else{
        // System.out.println("Prime");
        // }

        int count = 0;
        for (int i = 2; i <= n; i++) {
            if (n % i == 0 && n%n == 0) {
                count++;
                break;
            }
        }

        if (count == 1 && n > 1) {
            System.out.println("Prime number: ");
        } else {
            System.out.println("Not prime number: ");

        }
    }
}