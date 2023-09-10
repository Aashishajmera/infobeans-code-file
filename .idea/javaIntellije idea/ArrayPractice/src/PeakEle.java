//Q.1 Peak an element
//
//        An element is called a peak element if its value is not smaller than the value of its adjacent elements(if they exists).
//        Given an array arr[] of size N, find the index of any one of its peak elements.
//        Note: The generated output will always be 1 if the index that you return is correct. Otherwise output will be 0.
//
//        Example 1:
//        Input:
//        N = 3
//        arr[] = {1,2,3}
//        Output: 1
//        Explanation: index 2 is 3.
//        It is the peak element as it is
//        greater than its neighbour 2.
//        Example 2:
//        Input:
//        N = 2
//        arr[] = {3,4}
//        Output: 1
//        Explanation: 4 (at index 1) is the
//        peak element as it is greater than
//        its only neighbour element 3.
//        Constraints:
//        1 ≤ N ≤ 105
//        1 ≤

import java.util.Scanner;

public class PeakEle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int size = sc.nextInt();

        int arr[] = new int[size];
        System.out.println("Enter " + size + " element: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Default array element is: ");
        for (int ele : arr) {
            System.out.println(ele);
        }

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                System.out.println("Peak element index is: " + (i + 1) + " element is: " + arr[i + 1]);
                break;
            }
        }
    }
}
