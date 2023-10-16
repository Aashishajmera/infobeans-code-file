package ReturnRevisionArrrr;

import java.util.Scanner;

public class KthlargestAndSmallest {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int arr[] = new int[100];

        System.out.println("Enter size of array: ");
        byte size = sc.nextByte();

        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        // sort the array: using binary search: 
        int min, pos;
        for (int i = 0; i < size; i++) {
            min = arr[i];
            pos = i;
            for (int j = i + 1; j < size; j++) {
                if (min > arr[j]) {
                    min = arr[j];
                    pos = j;
                }
            }
            arr[pos] = arr[i];
            arr[i] = min;
        }

        System.out.println("Sorted array is: ");

        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println("Enter kth largest: ");
        int l = sc.nextInt();
        System.out.println("Enter kth smallest: ");
        int s = sc.nextInt();

        if (l < size && s < size) {
            System.out.println("largest " + arr[size - l]);
            System.out.println("smallest " + arr[s - 1]);
        } else {
            System.out.println("index out of bound: ");
        }
    }
}
