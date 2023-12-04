//       A
//     A B A
//   A B C B A
// A B C D C B A
//   A B C B A
//     A B A
//       A


public class Pt6 {

  public static void main(String[] args) {
    int k = 4, p = 1;
    for (int r = 1; r <= 7; r++) {
      char a = 64;
      k = (r <= 4) ? --k : ++k;
      for (int s = 1; s <= k; s++) {
        System.out.print("  ");
      }
      for (int c = 1; c <= p; c++) {
        a = (c <= r) ? ++a : (r > 4 && c <= (8 - r)) ? ++a : --a;
        System.out.print(a + " ");
      }
      System.out.println();
        p = (r < 4) ? p+2 : p-2;
    //   if (r < 4) p += 2; else p -= 2;
    }
  }
}
