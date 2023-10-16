package ReturnRevisionArrrr;

import java.util.Scanner;

public class BinarySearch {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int arr[] = new int[100];

        System.out.println("Enter size of array: ");
        byte size = sc.nextByte();

        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    arr[j] = arr[j] + arr[j + 1];
                    arr[j + 1] = arr[j] - arr[j + 1];
                    arr[j] = arr[j] - arr[j + 1];
                }
            }
        }

        System.out.println("Enter search element: ");
        int search = sc.nextInt();

        int low = 0;
        int high = size;
        boolean flag = true;
        for (int i = 0; i < size; i++) {
            int mid = (low + high) / 2;
            if (search == arr[mid]) {
                System.out.println("Element found: ");
                flag = false;
                break;
            } else if (search < arr[mid]) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        if (flag) {
            System.out.println("Element not found: ");
        }
    }
}
