//* * * * * * * * *
//  * * * * * * *
//    * * * * *
//      * * *
//        *
//      * * *
//    * * * * *
//  * * * * * * * 
//* * * * * * * * *
package looppractice;

import java.util.Scanner;

public class StructureFasion {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");  // ONLY 9 
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i <= 5 && j >= (i) && j <= (10 - i)) {
                    System.out.print("*");
                } else if (j >= (10 - i) && j <= (i) && i > 5) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
