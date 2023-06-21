// 18. WAP to calculate the sum of given series x^1 + x^2 + x ^3.........x^n 

import java.util.Scanner;

public class Q18CalculateNSqure {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any positive number: ");
        int n = sc.nextInt();

        int squre = 0;
        int i = 1;
        while (i <= n) {
            squre += i * i;
            i++;
        }
        System.out.println("Squre is: " + squre);

    }
}