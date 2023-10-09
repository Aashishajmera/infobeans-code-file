//  *
//  * * *
//  * * * * *
//  * * * * * * *
//  * * * * * * * * *
//  * * * * * * *
//  * * * * *
//  * * *
//  *

public class Pattern5 {

  public static void main(String[] args) {
    int k = 1;
    int l = k;
    for (int i = 1; i <= 9; i++) {
      if (i <= 5) {
        for (int j = 1; j <= k; j++) {
          System.out.print("*");
        }
        System.out.println();
        k += 2;
        l = k;
        l -= 2;
      } else {
        l -= 2;
        for (int j = 1; j <= l; j++) {
          System.out.print("*");
        }
        System.out.println();
      }
    }
  }
}
