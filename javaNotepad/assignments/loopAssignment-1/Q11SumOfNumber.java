// 11 WAP to calculate the sum of given series 1 - 2 + 3 - 4 + 5 - 6................n terms 

import java.util.Scanner;

public class Q11SumOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any positive number: ");
        int n = sc.nextInt();

        int i = 1, sumE = 0, sumO = 0, sum = 0;

        while (i <= n) {
            if (i % 2 != 0) {
                sumO += i;
            } else {
                sumE -= i;
            }
            i++;

        }
        sum = sumE + sumO;
        System.out.println(sum);
    }
}
