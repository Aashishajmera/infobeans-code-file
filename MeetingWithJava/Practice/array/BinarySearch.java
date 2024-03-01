package Practice.array;

import java.util.Scanner;

public class BinarySearch {

  public static int[] sort(int arr[]) {
    for (int i = 0; i < arr.length; i++) {
      for (int j = 0; j < arr.length - i - 1; j++) {
        if (arr[j] > arr[j + 1]) {
          arr[j] = arr[j] + arr[j + 1];
          arr[j + 1] = arr[j] - arr[j + 1];
          arr[j] = arr[j] - arr[j + 1];
        }
      }
    }
    return arr;
  }

  public static boolean search(int arr[], int element) {
    int left = 0, right = arr.length - 1;
    boolean flag = false;
    for (int i = 0; i < arr.length; i++) {
      int mid = left + (right - left) / 2;
      if (arr[mid] == element) {
        flag = true;
        break;
      } else if (arr[mid] > element) {
        right = mid - 1;
      } else {
        left = mid + 1;
      }
    }
    return flag;
  }

  public static void main(String[] args) {
    int arr[] = { 1, 2, 3, 4, 5, 5, 3, 2 };

    Scanner sc = new Scanner(System.in);
    System.out.println("Enter find element: ");
    int element = sc.nextInt();

    arr = sort(arr);

    boolean flag = search(arr, element);

    if (flag) System.out.println("found: "); else System.out.println(
      "Not found: "
    );
  }
}
