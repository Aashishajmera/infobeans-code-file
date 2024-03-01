//     *
//     *
//   * * *
//   * * *
// * * * * *
// * * * * *
public class P2 {
    public static void main(String[] args) {
        int k = 0, s = 3;
        for(int i = 1; i <= 6; i++){
            k = (i % 2 != 0) ? k+2 : k;
            s = (i % 2 != 0) ? --s : s;
            for(int j = 1; j <= s; j++){
                System.out.print("  ");
            }
            for(int j = 1; j < k; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
