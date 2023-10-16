//        A
//      A B A
//    A B C B A
//  A B C D C B A
//A B C D E D C B A
package looppractice;

public class Alphabet {

    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            char ch = 64;
            for (int j = 1; j <= 9; j++) {
                if (j >= (6 - i) && j <= (4 + i)) {
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
