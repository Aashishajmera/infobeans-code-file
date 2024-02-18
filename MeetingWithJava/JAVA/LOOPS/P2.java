//         1 
//       2 1
//     3 2 1
//   4 3 2 1
// 5 4 3 2 1 
//   4 3 2 1
//     3 2 1 
//       2 1 
//         1

package JAVA.LOOPS;

public class P2 {
    public static void main(String[] args) {
        int k = 5;
        int z = 0;
        for(int i = 1; i <= 9; i++){
            k = (i <= 5) ? --k : ++k;
          
        }
    }
}
