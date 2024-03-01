package Practice.array;

public class Sorting {

  public static int[] sort(int arr[]) {
    for (int i = 0; i < arr.length; i++) {
      for (int j = 0; j < arr.length - i - 1; j++) {
        if (arr[j] > arr[j+1]) {
          arr[j] = arr[j] + arr[j+1];
          arr[j+1] = arr[j] - arr[j+1];
          arr[j] = arr[j] - arr[j+1];
        }
      }
    }
    return arr;
  }

  public static void main(String[] args) {
    int arr[] = { 3, 4, 2, 5, 6, 1, 0 };

    arr = sort(arr);
    // Arrays.sort(arr);

    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i]);
    }
  }
}
