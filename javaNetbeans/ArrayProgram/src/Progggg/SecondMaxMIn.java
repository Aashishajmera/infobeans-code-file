package Progggg;

import java.util.Scanner;

public class SecondMaxMIn {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int arr[] = new int[100];

        System.out.println("Enter size of array: ");
        byte size = sc.nextByte();

        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        int max = -2147483648;
        int smax = -2147483648;
        int min = 2147483647;
        int smin = 2147483647;

        for (int i = 0; i < size; i++) {
            if (min > arr[i]) {
                smin = min;
                min = arr[i];
            } else if (smin > arr[i] && min != arr[i]) {
                smin = arr[i];
            }

            if (max < arr[i]) {
                smax = max;
                max = arr[i];
            } else if (smax < arr[i] && max != arr[i]) {
                smax = arr[i];
            }
        }

        System.out.println("max: " + max);
        System.out.println("smax: " + smax);
        System.out.println("min: " + min);
        System.out.println("smin: " + smin);

    }
}
