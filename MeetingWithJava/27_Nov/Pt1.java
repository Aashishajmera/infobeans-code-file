// A
// B A
// C B A
// D C B A
// E D C B A
// D C B A
// C B A
// B A
// A

public class Pt1 {

  public static void main(String[] args) {
    char a = 65;
    int k = 0;
    for (int r = 1; r <= 9; r++) {
      char p = a;
      k = (r <= 5) ? ++k : --k;
      for (int c = 1; c <= k; c++) {
        System.out.print(p + " ");
        p--;
      }
      System.out.println();
      a = (r < 5) ? ++a : --a;
    }
  }
}
