package lltopic;

import java.util.LinkedList;
import java.util.Scanner;

public class Occurance {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList ll = new LinkedList();

//        ll.add(10);
//        ll.add(20);
//        ll.add(30);
//        ll.add(100);
//        ll.add(90);
//        ll.add(10);
        System.out.println("Enter size of array: ");
        int size = sc.nextInt();

        System.out.println("Enter " + size + " element: ");

        for (int i = 0; i < size; i++) {
            ll.add(sc.nextInt());
        }

        for (int i = 0; i < ll.size(); i++) {
            int checkVar = 0;
            for (int j = i; j < ll.size(); j++) {
                if (ll.get(i) == ll.get(j)) {
                    checkVar++;
                }
            }
            if (checkVar != 1) {
                System.out.println("Element " + ll.get(i) + " is repeat " + checkVar);
            }
        }
    }
}
