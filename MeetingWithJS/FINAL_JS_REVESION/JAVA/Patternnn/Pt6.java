// package FINAL_JS_REVESION.JAVA.Patternnn;

public class Pt6 {

  public static void main(String[] args) {
    int k = 0;
    for (int i = 1; i <= 5; i++) {
      k = (i <= 3) ? k + 2 : k - 2;
      for (int j = 1; j <= k; j++) {
        System.out.print("*");
      }
      System.out.println();
    }
  }
}
