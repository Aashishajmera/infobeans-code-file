//         A
//       A B A
//     A B C B A
//   A B C D C B A
// A B C D E D C B A

/*
    k = 0 
    p = 1 3
    r = 1 2
    a = 65
    s = 1 
    c = 1 2
    k = 1 


    OUTPUT
    _ _ _ _ A _
    _ _ _ A B A _

 */

public class Pt3 {

  public static void main(String[] args) {
    // int p = 1;
    // for (int r = 1; r <= 5; r++) {
    //   char a = 64;
    //   for (int s = 1; s <= 5 - r; s++) {
    //     System.out.print("  ");
    //   }
    //   for (int c = 1; c <= p; c++) {
    //     a = (c <= r) ? ++a : --a;
    //     System.out.print(a + " ");
    //   }
    //   p += 2;
    //   System.out.println();
    // }

    //         A
    //       A B A
    //     A B C B A
    //   A B C D C B A
    // A B C D E D C B A

    // CONDITIONS
    // for (int r = 1; r <= 5; r++) {
    //   char a = 64;
    //   for (int c = 1; c <= 9; c++) {
    //     if (c >= (6 - r) && c <= (4 + r)) {
    //       a = (c <= 5) ? ++a : --a;
    //       System.out.print(a + " ");
    //     } else {
    //       System.out.print("  ");
    //     }
    //   }
    //   System.out.println();
    // }
  }
}
