package FINAL_JS_REVESION.JAVA.Patternnn;

public class Pt5 {

  public static void main(String[] args) {
    int even = 2;
    for (int row = 1; row <= 5; row++) {
      if (row <= 3) {
        for (int col = 1; col <= even; col++) {
          System.out.print("*");
        }
        even += 2;
      } else {
        if (row == 3+1) {
          even -= 2;
        }
        even -= 2;
        for (int col = 1; col <= even; col++) {
          System.out.print("*");
        }
      }
      System.out.println();
    }
  }
}
