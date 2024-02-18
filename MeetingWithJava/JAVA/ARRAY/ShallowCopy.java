public class ShallowCopy {

  public static void m1(int arr[]) {
    arr[0] = 1111;
    for (int value : arr) {
      System.out.println(value);
    }

  }

  public static void main(String[] args) {
    int arr[] = { 11, 22, 33, 44, 55 };

    // shallow copy
    ShallowCopy.m1(arr);
    // deap copy
    ShallowCopy.m1(arr.clone());
    for (int value : arr) {
        System.out.println(value);
      }

    // ShallowCopy shallowCopy = new ShallowCopy();
    // System.out.println(shallowCopy);
    // ShallowCopy shallowCopy2 = shallowCopy;
    // System.out.println(shallowCopy2);


  }
}
