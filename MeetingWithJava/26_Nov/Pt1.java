public class Pt1 {

  public static void main(String[] args) {
    int value = 1;
    for (int r = 1; r <= 5; r++) {
      for (int s = 1; s <= (5 - r); s++) {
        System.out.print(" ");
      }
      int k = 0;
      for (int c = 1; c <= value; c++) {
        k = (c <= r) ? ++k : --k;
        System.out.print(k);
      }
      System.out.println();
      value += 2;
    }
  }
}
