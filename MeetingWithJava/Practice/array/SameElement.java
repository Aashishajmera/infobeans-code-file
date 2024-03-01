package Practice.array;

import java.util.Scanner;

public class SameElement {

  public static int check_same(int arr[], int number) {
    int count = 0;
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] == number) {
        count++;
      }
    }

    return count;
  }

  public static void main(String[] args) {
    int arr[] = { 1, 2, 3, 4, 4, 3, 8 };

    Scanner sc = new Scanner(System.in);
    System.out.println("Enter check number: ");
    int number = sc.nextInt();

    int count = check_same(arr, number);
    System.out.println("Total occurance of " + number + " is: " + count);
  }
  
}
