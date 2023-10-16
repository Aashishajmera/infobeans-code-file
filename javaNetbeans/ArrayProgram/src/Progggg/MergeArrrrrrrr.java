package Progggg;

import java.util.Scanner;

public class MergeArrrrrrrr {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr1[] = {1, 2, 3, 4};
        int arr2[] = {5, 6, 7, 8};

        int arr3[] = new int[arr1.length + arr2.length];
        int k = 0;
        for (int i = 0; i < arr3.length; i++) {
            if (arr1.length > i) {
                arr3[i] = arr1[i];
            } else {
                arr3[i] = arr2[k];
                k++;
            }
        }

        for (int i = 0; i < arr3.length; i++) {
            System.out.print(arr3[i] + " ");
        }
    }
}
