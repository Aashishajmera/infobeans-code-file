// package Practice.array;

public class Union {

  public static void union_check(int arr[], int arr2[]) {
    int size = arr.length + arr2.length;
    int arr3[] = new int[size];
    for (int i = 0; i < arr.length; i++) {
      arr3[i] = arr[i];
    }

    int index = arr.length;
    for (int i = 0; i < arr2.length; i++) {
      boolean flag = false;
      for (int j = 0; j < arr.length; j++) {
        if (arr2[i] == arr[j]) {
          flag = true;
          break;
        }
      }

      if (!flag) {
        arr3[index++] = arr2[i];
      }
    }

   for(int i = 0; i < index; i++){
    System.out.print(arr3[i]);
   }
  }

  public static void main(String[] args) {
    int arr[] = { 1, 2, 3, 4, 5 };
    int arr2[] = { 3, 4, 5, 6, 7 };

    union_check(arr, arr2);
  }
}
