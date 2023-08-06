// Q.1 Peak an element

// An element is called a peak element if its value is not smaller than the value of its adjacent elements(if they exists).
// Given an array arr[] of size N, find the index of any one of its peak elements.
// Note: The generated output will always be 1 if the index that you return is correct. Otherwise output will be 0.

import java.util.Scanner;

class PickElement {
    public int pickElement(int arr[], int size) {
        int check = 1;
        for (int i = 0; i < size-1; i++) {
            if (arr[i] > arr[i+1]) {
              check = 0;
              break;
            }
        }
        return check;
    }
}

class Q1PeakElmnt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[100];

        System.out.println("Enter size of array: ");
        int size = sc.nextInt();

        // input array element:
        System.out.println("Enter " + size + " element: ");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        // print array element :
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        // create object:
        PickElement obj = new PickElement();
       int ans = obj.pickElement(arr, size);
       System.out.println(ans);

    }
}