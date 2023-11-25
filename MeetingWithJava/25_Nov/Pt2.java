//      1
//     3 2
//    5 4 3
//   7 6 5 4
//  9 8 7 6 5

public class Pt2 {

  public static void main(String[] args) {
    int k = 1;
    for (int r = 1; r <= 5; r++) {
      //   k = r + 2; // k = 2 + 3 ==> 5
      for (int s = 1; s <= (5 - r); s++) {
        System.out.print(" ");
      }

      for (int c = 1; c <= r; c++) {
        System.out.print(k + " ");
        k--;
      }
      System.out.println();
      k = r + (r + 1); // k = 3 + 4 ==> 7
    }
  }
}
