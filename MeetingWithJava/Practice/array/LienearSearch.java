package Practice.array;

import java.util.Scanner;

public class LienearSearch {

  public static boolean search(int arr[], int num) {
    boolean flag = false;
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] == num) {
        flag = true;
        break;
      }
    }
    return flag;
  }

  public static void main(String[] args) {
    int arr[] = { 1, 2, 3, 4, 5, 6 };

    Scanner sc = new Scanner(System.in);
    System.out.println("Enter find element: ");
    int num = sc.nextInt();

    boolean flag = search(arr, num);

    if (flag) System.out.println("found: "); else System.out.println(
      "Not found: "
    );
  }
}
