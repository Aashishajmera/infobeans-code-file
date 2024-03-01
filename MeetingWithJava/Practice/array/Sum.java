// package Practice.array;

public class Sum {

  public static int findSum(int arr[], int sum) {
    for (int i = 0; i < arr.length; i++) {
      sum += arr[i];
    }
    return sum;
  }

  public static void main(String[] args) {
    int arr[] = { 1, 2, 3, 4, 5 };
    int sum = 0;
    sum = findSum(arr, sum);

    System.out.println("Total array element sum is: "+sum);
  }
}
