// A
// B B
// C C C
// D D D D

public class Pt2 {

  public static void main(String[] args) {
    int a = 'A';
    for (int r = 1; r <= 4; r++) {
      for (int c = 1; c <= r; c++) {
        System.out.print((char)(a)+" ");
      }
      a++;
      System.out.println();
    }
  }
}
