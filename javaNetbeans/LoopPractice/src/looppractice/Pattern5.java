//12344321
//123__321
//12____21
//1______1
package looppractice;

public class Pattern5 {

    public static void main(String[] args) {
        for (int i = 1; i <= 4; i++) {
            int n = 0;
            for (int j = 1; j <= 8; j++) {
                n = (j <= 4 ? ++n : --n);
                if (j == 5) {
                    ++n;
                }
                if (i >= 2 && j >= (6 - i) && j <= (3 + i)) {
                    System.out.print("_");
                } else {
                    System.out.print(n);
                }
            }
            System.out.println();
        }
    }
}
