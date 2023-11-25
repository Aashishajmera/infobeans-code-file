public class Recursion {

  public static int printNum(int k) {
    if (k >= 1) {
      printNum(k - 1);
      System.out.println(k);
      return 0;
    } else {
      return 0;
    }
  }

  public static void main(String[] args) {
    printNum(10);
  }
}
