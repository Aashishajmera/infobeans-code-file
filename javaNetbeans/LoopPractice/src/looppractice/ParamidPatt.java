//1
//1 2 3
//1 2 3 4 5
//1 2 3 4 5 6 7
//1 2 3 4 5 6 7 8 9
package looppractice;

public class ParamidPatt {

    public static void main(String[] args) {
        int n = 1;
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print(j);
            }
            n += 2;
            System.out.println();
        }
    }
}
