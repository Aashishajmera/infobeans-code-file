// 25. Calculate the sum of following serires
//    1/x + 1/x^2 + 1/x^3......1/x^n

import java.util.Scanner;

public class Q25PowerSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any first positive number: ");
        int x = sc.nextInt();
        System.out.println("Enter any positive number: ");
        int n = sc.nextInt();
        float sum = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = i; j != 0; j--) {
                if(j != 0){
                x *= j;
                }
            }
            sum += 1.0f / x ;
        }
        System.out.println("Sum is: " + sum);
    }
}
