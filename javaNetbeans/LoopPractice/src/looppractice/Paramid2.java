//ABCDEFFEDCBA
//ABCDE  EDCBA
//ABCD    DCBA
//ABC      CBA
//AB        BA
//A          A
package looppractice;

import java.util.Scanner;

public class Paramid2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        for (int i = 1; i <= 6; i++) {
//            char ch = 64;
//            for (int j = 1; j <= 6 << 1; j++) {
//                ch = (j <= 6 ? ++ch :--ch);
//                if(j == 7)
//                    ++ch;
//                if(i >= 2 && j >= (8-i) && j <= (5 + i)){
//                    System.out.print("_");
//                }else{
//                    System.out.print(ch);
//                }
//            }
//            System.out.println();
//        }
        System.out.println("Enter number: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            char ch = 64;
            for (int j = 1; j <= n << 1; j++) {
                ch = (j <= n ? ++ch : --ch);
                if (j == n + 1) {
                    ++ch;
                }
                if (i >= 2 && j >= ((n + 2) - i) && j <= ((n - 1) + i)) {
                    System.out.print("_");
                } else {
                    System.out.print(ch);
                }
            }
            System.out.println();
        }
    }
}
