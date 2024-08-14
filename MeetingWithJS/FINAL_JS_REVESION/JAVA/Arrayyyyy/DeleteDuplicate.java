package FINAL_JS_REVESION.JAVA.Arrayyyyy;
import java.util.Scanner;

public class DeleteDuplicate {

  public static void main(String[] args) {
    int arr[] = new int[100];
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter length of array: ");
    int size = sc.nextInt();

    for (int i = 0; i < size; i++) {
      arr[i] = sc.nextInt();
    }

    for (int i = 0; i < size; i++) {
      for (int j = i + 1; j < size; j++) {
        if (arr[i] == arr[j]) {
          for (int k = j; k < size - 1; k++) {
            arr[k] = arr[k + 1];
          }
          j--;
          size--;
        }
      }
    }

    for (int i = 0; i < size; i++) {
      System.out.print(arr[i] + " ");
    }
  }
}
