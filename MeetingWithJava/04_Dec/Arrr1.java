import java.util.Scanner;

public class Arrr1 {

  public static void main(String[] args) {
    // take a input

    Scanner sc = new Scanner(System.in);
    System.out.println("Enter size of array: ");
    int size = sc.nextInt();

    int arr[] = new int[size];

    System.out.println("Enter " + size + " element: ");
    for (int i = 0; i < arr.length; i++) {
      arr[i] = sc.nextInt();
    }

    System.out.println("Array element is: ");
    for (int value : arr) {
      System.out.println(value);
    }

    // TWO D ARRAY
    //  int arr1[][] = new int[2][];
    int[][] arr1 = { { 23, 45 }, { 34, 56 } };
    
  }
}
