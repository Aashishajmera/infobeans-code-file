
import java.util.Scanner;

public class BinarySearch {

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

        System.out.println("Enter search element: ");
        int ele = sc.nextInt();

        System.out.println("Default array: ");
        sA.printArrElement(arr);

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] < arr[j + 1]) {
                    arr[j] = arr[j] + arr[j + 1];
                    arr[j + 1] = arr[j] - arr[j + 1];
                    arr[j] = arr[j] - arr[j + 1];
                }
            }
        }

        System.out.println("sort arr: ");
        sA.printArrElement(arr);

        int first = 0;
        int last = arr.length;
        boolean flag = true;
        for (int i = 0; i < arr.length; i++) {
            int mid = (first + last) / 2;
            if (arr[mid] == ele) {
                flag = false;
                break;
            } else if (ele < arr[mid]) {
                first = first + mid;

            } else {
                last = last - mid;;
            }
        }
        if (flag) {
            System.out.println("Not found: ");
        } else {
            System.out.println("Found: ");
        }
    }
}
