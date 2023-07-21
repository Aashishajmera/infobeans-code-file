// 32) A b C d E f G h …… n terms

import java.util.Scanner;

class Alpha {
    public void alpha(int n) {
        char low = 98, upp = 65;
        if (n <= 26 && n >= 1) {
            for (int i = 1; i <= n; i++) {
                // capital
                if (i % 2 == 0) {
                    System.out.println(low);
                    low+=2;
                } else {
                    System.out.println(upp);
                    upp+=2;
                }
            }
        }
    }
}

public class Q32Alphabet2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number: ");
        int n = sc.nextInt();

        // create object
        Alpha obj = new Alpha();
        obj.alpha(n);

        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter any word: ");
        // char ch = sc.next().charAt(0);
        // char n;
        // if (ch >= 'A' && ch <= 'Z') {
        //     n = 'A';
        //     for (; n <= ch; n++) {
        //         if (n % 2 == 0) {
        //             char z = (char) (n + 32);
        //             System.out.println(z);

        //         } else {
        //             System.out.println(n);

        //         }
        //     }
        // }else{
        //     n = 'a';
        //     for(; n <= ch; n++){
        //         if(n % 2 == 0){
        //             System.out.println(n);
        //         }else{
        //             char z = (char)(n-32);
        //             System.out.println(z);
        //         }
        //     }
        // }
    }
}
