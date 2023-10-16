//        A
//      A B
//    A B C
//  A B C D
//A B C D E
//  A B C D
//    A B C
//      A B
//        A
package looppractice;

public class Patter4 {

    public static void main(String[] args) {
        for (int i = 1; i <= 9; i++) {
            char ch = 64;
            for (int j = 1; j <= 5; j++) {
                if (j >= (6 - i) && i <= 5) {
                    ch = (j <= 5 ? ++ch : --ch);
                    System.out.print(ch);
                } else if (j >= (i-4) && i > 5) {
                    ch = (j <= 5 ? ++ch : --ch);
                    System.out.print(ch);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
