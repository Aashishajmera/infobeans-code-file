package JAVA.LOOPS;

import java.util.Scanner;

public class Pt1 {

  // 1
  // 2 6
  // 3 7 10
  // 4 8 11 13
  // 5 9 12 14 15

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    for (int i = 1; i <= n; i++) {
      int k = i;
      int z = n - 1;
      for (int j = 1; j <= i; j++) {
        System.out.print(k + " ");
        k += z;
        z--;
      }
      System.out.println();
    }
  }
}
