// 2) WAP to print N natural number.

import java.util.Scanner;

public class Q2NaturalNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any positive number: ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            if (i == 1) {
                System.out.println("Natural number is: ");
            }
            System.out.println(i);
        }
    }
}
