package looppractice;

public class Patternnnn1 {

    public static void main(String[] args) {
        for (int i = 1; i <= 9; i++) {
            int count = 0;
            for (int j = 1; j <= 9; j++) {
                if (j >= (6 - i) && j <= (4 + i) && i <= 5) {
                    count = (j <= 5 ? ++count : --count);
                    System.out.print(count+" ");
                } else if (j >= (i - 4) && j <= (14 - i) && i > 5) {
                    count = (j <= 5 ? ++count : --count);
                    System.out.print(count+" ");
                } else {
                    System.out.print("  ");

                }
            }
            System.out.println();
        }
    }
}
