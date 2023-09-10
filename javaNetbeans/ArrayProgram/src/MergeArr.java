
import java.util.Scanner;

public class MergeArr {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // create a object of sortele class
        SortArr sA = new SortArr();

        System.out.println("Enter size of array: ");
        int size = sc.nextInt();

        int arr[] = new int[size];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter second array size: ");
        int size2 = sc.nextInt();
        int arr2[] = new int[size2];

        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = sc.nextInt();
        }

        int arr3[] = new int[size + size2];
        for (int i = 0; i < arr3.length; i++) {
            if (i < arr.length) {
                arr3[i] = arr[i];
            } else {
                arr3[i] = arr2[i - arr.length];
            }
        }

        System.out.println("merge array: ");
        sA.printArrElement(arr3);
    }
}
