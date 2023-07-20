// 39) WAP to check whether entered number is strong or not

import java.util.Scanner;

public class Q39Strong2 {

    // create method:
    public void strong(int n) {
        int rem = 0, temp = n, ans = 0;
        while (n != 0) {
            rem = n % 10;
            int fact = 1;
            for (int i = rem; i >= 2; i--) {
                fact *= i;
            }
            ans += fact;
            n = n / 10;
        }
        if (temp == ans) {
            System.out.println("Entered number is strong number: ");
        } else {
            System.out.println("Not strong: ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number: ");
        int n = sc.nextInt();

        // create object:
        Q39Strong2 obj = new Q39Strong2();
        obj.strong(n);
    }
}
