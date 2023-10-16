package ReturnRevisionArrrr;

import java.util.Scanner;

public class SelectionSort {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int arr[] = new int[100];

        System.out.println("Enter size of array: ");
        byte size = sc.nextByte();

        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        int min, position;
        for (int i = 0; i < size; i++) {
            min = arr[i];
            position = i;
            for (int j = i + 1; j < size; j++) {
                if (min > arr[j]) {
                    min = arr[j];
                    position = j;
                }
            }

            arr[position] = arr[i];
            arr[i] = min;

        }

        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
