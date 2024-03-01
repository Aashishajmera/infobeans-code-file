package Practice.array;

import java.util.Scanner;

public class RotateAr1 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a size of array: ");
    int size = sc.nextInt();

    int arr[] = new int[size];

    System.out.println("Enter " + size + " element: ");
    for (int i = 0; i < arr.length; i++) {
      arr[i] = sc.nextInt();
    }

    System.out.println("Enter rotate value: ");
    int rotate = sc.nextInt();

    int arr2[] = new int[size];
    int index = 0;
    for (int i = rotate - 1; i < arr.length; i++) {
      arr2[index] = arr[i];
      index++;
    }

    for (int i = 0; i < rotate - 1; i++) {
      arr2[index] = arr[i];
      index++;
    }

    System.out.println("Rotate array is: ");
    for (int i = 0; i < arr2.length; i++) {
      System.out.print(arr2[i]);
    }
  }
}
