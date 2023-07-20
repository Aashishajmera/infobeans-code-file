// 9) WAP to print N even numbers.

import java.util.Scanner;

public class Q9Even2 {

    // create methods
    public void even(int n) {
        if (n > 0) {
            System.out.print("Even number is: ");
        }
        for (int i = 1; i <= n * 2; i++) {
            if (i % 2 == 0) {
                System.out.print(i+" ");
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n number: -Even number");
        int n = sc.nextInt();

        // create object:
        Q9Even2 obj = new Q9Even2();
        obj.even(n);

    }
}
