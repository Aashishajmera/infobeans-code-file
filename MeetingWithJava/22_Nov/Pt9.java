//         1
//       1 2 1
//     1 2 3 2 1
//   1 2 3 4 3 2 1
// 1 2 3 4 5 4 3 2 1
public class Pt9 {

  public static void main(String[] args) {
    int k = 1;
    for (int i = 1; i <= 5; i++) {
      int value = 1;
      for (int j = 1; j <= 5 - i; j++) {
        System.out.print(" ");
      }
      boolean flag = false;
      for (int j = 1; j <= k; j++) {
        if (value < i && flag == false) {
          System.out.print(value++);
        } else {
          System.out.print(value--);
          flag = true;
        }
      }
      k += 2;
      System.out.println();
    }
  }
}
