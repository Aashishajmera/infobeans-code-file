// A B C D E D C B A  1 == 9
//   B C D E D C B    2 == 7
//     C D E D C     3 == 5
//       D E D     4  == 3
//         E    5 == 1
public class Pt2 {

  public static void main(String[] args) {
    // int k = 10;
    // char a = 64;
    // for(int r = 5; r >= 1; r--){
    //     for(int s = 5; s > r; s--){
    //         System.out.print("  ");
    //     }
    //     for(int c = 1; c < k; c++){
    //         a = (c <= r) ? ++a :--a;
    //         System.out.print(a+" ");
    //     }
    //     System.out.println();
    //     k -= 2;
    // }

    // int k = 10;
    // char a = 64;
    // for (int r = 1; r <= 5; r++) {
    //   for (int c = 1; c <= 9; c++) {
    //     if (c >= r && c <= (k - r)) {
    //       a = (c <= 5) ? ++a : --a;
    //       System.out.print(a + " ");
    //     } else {
    //       System.out.print("  ");
    //     }
    //   }
    //   System.out.println();
    // }

    for (int r = 1; r <= 5; r++) {
      for (int s = 1; s < r; s++) {
        System.out.print("  ");
      }
      for (int k = r; k <= 5; k++) {
        System.out.print((char) (k + 64)+" ");
      }
      for (int k = 4; k >= r; k--) {
        System.out.print((char) (k + 64)+" ");
      }
      System.out.println();
    }
  }
}
