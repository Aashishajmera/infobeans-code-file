// 24. WAP in C to display the n terms of harmonic series and
//    their sum
//    1 + 1/2 + 1/3 + 1/4 + 1/5 ... 1/n terms

import java.util.Scanner;

public class Q24HarmonicSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any positive number:");
        float n = sc.nextInt();
        float one = 0;

        for (int i = 1; i <= n; i++) {
            if (i == n) {
                System.out.print("1/" + i);

            } else {
                System.out.print("1/" + i + " + ");
            }
            one += 1.0f / i;
        }
        System.out.println();
        System.out.println("Sum is: " + one);
    }
}
