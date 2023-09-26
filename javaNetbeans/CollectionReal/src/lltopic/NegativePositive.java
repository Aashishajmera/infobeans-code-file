package lltopic;

import java.util.LinkedList;
import java.util.Scanner;

public class NegativePositive {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList ll = new LinkedList();
        LinkedList ll2 = new LinkedList();
        LinkedList ll3 = new LinkedList();

        System.out.println("Enter size of array: ");
        int size = sc.nextInt();

        System.out.println("Enter " + size + " element: ");

        for (int i = 0; i < size; i++) {
            ll.add(sc.nextInt());
        }

        for (int i = 0; i < ll.size(); i++) {
            if ((int) ll.get(i) >= 0) {
                ll2.add(ll.get(i));
            } else {
                ll3.add(ll.get(i));
            }
        }

            int k = 0;
        for (int i = 0; i < ll2.size() + ll3.size(); i++) {
            if (i < ll2.size()) {
                System.out.print(ll2.get(i) + " ");
            } else {
                
                System.out.print(ll3.get(k) + " ");
                k++;
            }
        }
    }
}
