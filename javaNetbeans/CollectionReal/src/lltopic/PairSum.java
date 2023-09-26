//Q.11 Count pair with given sum.
//Given an array of N integers, and an integer K, find the number of pairs of elements in the array whose sum is equal to K.
package lltopic;

import java.util.LinkedList;
import java.util.Scanner;

public class PairSum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList ll = new LinkedList();

        System.out.println("Enter size of array: ");
        int size = sc.nextInt();

        System.out.println("Enter " + size + " element: ");

        for (int i = 0; i < size; i++) {
            ll.add(sc.nextInt());
        }

        System.out.println("Enter target: ");
        int target = sc.nextInt();
        boolean flag = false;
        for (int i = 0; i < ll.size(); i++) {
            int sum = 0;
            int j = i;
            for (; j < ll.size(); j++) {
                sum += (int) ll.get(i);
                if (sum == target) {
                    flag = true;
                    for (int k = i; k < j; k++) {
                        System.out.print(ll.get(k) + " ");
                    }
                }
            }
        }
        if (!flag) {
            System.out.println("Not match: ");
        }
    }
}
