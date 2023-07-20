// 6) WAP to find out the factors of a number.

import java.util.Scanner;

public class Q6Factors2 {
    // create method:
    public void factor(int n) {
        System.out.print(n + " factor is: ");
        if (n >= 0) {
            for (int i = 1; i <= n; i++) {
                if (n % i == 0) {
                    System.out.print(i + " ");
                }
            }
        } else{
            for (int i = n; i <= 1; i++) {
                if (n % i == 0) {
                    System.out.print(i + " ");
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number: ");
        int n = sc.nextInt();

        // create object:
        Q6Factors2 obj = new Q6Factors2();
        obj.factor(n);
    }
}