// 8) WAP to print Fibonacci series.

import java.util.Scanner;

public class Q8Fibonacci {

    // create method:
    public void fibonacci(int n) { 
        int a = 0, b = 1, c = 0;
        for (int i = 1; i <= n; i++) {
            a = b;
            System.out.println(c);
            b = c;
            c = a + b;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number: -Fibonacci series");
        int n = sc.nextInt();

        // create object 
        Q8Fibonacci obj = new Q8Fibonacci();
        obj.fibonacci(n);
    }
}
