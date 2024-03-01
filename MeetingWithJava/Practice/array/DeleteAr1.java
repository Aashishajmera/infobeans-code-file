package Practice.array;

import java.util.Scanner;

public class DeleteAr1 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a size of array: ");
    int size = sc.nextInt();

    int arr[] = new int[size];

    System.out.println("Enter " + size + " element: ");
    for (int i = 0; i < arr.length; i++) {
      arr[i] = sc.nextInt();
    }

    System.out.println("Enter delete element: ");
    int deleteEle = sc.nextInt();

    boolean flag = false;

    for (int i = 0; i < arr.length; i++) {
      if (arr[i] == deleteEle) {
        flag = true;
        break;
      }
    }

    if (flag) {
      int arr2[] = new int[arr.length - 1];
      for (int i = 0, j = 0; i < arr.length; i++) {
        if (arr[i] != deleteEle) {
          arr2[j++] = arr[i];
        }
      }

      System.out.println("Updated array.....");
      for (int i = 0; i < arr2.length; i++) {
        System.out.print(arr2[i]);
      }
    } else {
      System.out.println("Element not found...");
    }
  }
}
