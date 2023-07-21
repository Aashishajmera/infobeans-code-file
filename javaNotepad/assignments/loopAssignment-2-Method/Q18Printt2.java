// 18) 1 2 2 4 8 32 …… n terms

import java.util.Scanner;

public class Q18Printt2 {
    // create method:
    public void printmul(int n) {
        int a = 1, b = 2, ans = 1;
        System.out.println("series is: ");
        for (int i = 1; i <= n; i++) {
            a = b;
            System.out.println(ans);
            b = ans;
            ans = a*b;

        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any positive number: ");
        int n = sc.nextInt();

        // create object:
        Q18Printt2 obj = new Q18Printt2();
        obj.printmul(n);
    }
}