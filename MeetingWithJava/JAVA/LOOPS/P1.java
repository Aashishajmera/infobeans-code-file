// 1
// 1 2
// 1 2 3
// 1 2 3 4 
// 1 2 3 4 5
// 1 2 3 4 
// 1 2 3
// 1 2 
// 1


package JAVA.LOOPS;

public class P1 {
    public static void main(String[] args) {
        int k = 0;
        for(int i = 1; i <= 9; i++){
             k = (i <= 5) ? ++k : --k;
            for(int j = 1; j <= k; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
