package lltopic;

import java.util.LinkedList;
import java.util.Scanner;

public class Rotatttte {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList ll = new LinkedList();
        LinkedList ll2 = new LinkedList();

        System.out.println("Enter size of array: ");
        int size = sc.nextInt();

        System.out.println("Enter " + size + " element: ");

        for (int i = 0; i < size; i++) {
            ll.add(sc.nextInt());
        }

        for (int i = 0; i < ll.size(); i++) {
            if (i != ll.size() - 1) {
                ll2.add(ll.get(i + 1));
            } else {
                ll2.add(ll.get(0));
            }
        }

        for (int i = 0; i < ll2.size(); i++) {
            System.out.print(ll2.get(i) + " ");
        }
    }
}
