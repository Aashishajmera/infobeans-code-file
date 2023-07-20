// 12) WAP to print Odd numbers upto N.

import java.util.Scanner;

public class Q12OddN {

    // create method
    public void oddN(int n) {
        if (n >= 1) {
            System.out.print("Odd number is: ");
        }
        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number: ");
        int n = sc.nextInt();

        // create object:
        Q12OddN obj = new Q12OddN();
        obj.oddN(n);
    }
}
