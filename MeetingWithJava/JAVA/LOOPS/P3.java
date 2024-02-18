//     1
//    121
//   12321
//  1234321
// 123454321

package JAVA.LOOPS;

public class P3 {

  public static void main(String[] args) {
    int k = 1;
    for (int i = 1; i <= 5; i++) {
      for (int j = 1; j <= (5 - i); j++) {
        System.out.print(" ");
      }
      int z = 0;
      for (int l = 1; l <= k; l++) {
        z = (l <= i) ? ++z : --z;
        System.out.print(z);
      }
      k += 2;
      System.out.println();
    }
  }
}
