// 11) WAP to print N odd numbers.

import java.util.Scanner;

public class Q11Odd2 {
    // create method:

    public void odd(int n) {
        if (n > 0) {
            System.out.println("odd number is: ");
            for (int i = 1; i <= n * 2; i++) {
                if (i % 2 != 0) {
                    System.out.println(i);
                }
            }
        } else if (n < 0) {
            System.out.println("odd number is: ");
            for (int i = 1; i >= n * 2; i--) {
                if (i % 2 != 0) {
                    System.out.println(i);
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number: ");
        int n = sc.nextInt();

        Q11Odd2 obj = new Q11Odd2();
        obj.odd(n);
    }
}
