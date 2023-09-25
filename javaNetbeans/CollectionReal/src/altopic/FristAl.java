package altopic;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class FristAl {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of array: ");
        int size = sc.nextInt();
        ArrayList<Integer> al = new ArrayList<Integer>(size);
        System.out.println("Entet " + size + " element: ");
        for (int i = 0; i < size; i++) {
            al.add(sc.nextInt());
        }

        for (int i = 0; i < al.size(); i++) {
            System.out.print(al.get(i) + " ");
        }

        System.out.println();

        System.out.println("Total element in arrayList is: " + al.size() + "\n");
        al.add(2, 30);
        al.add(40);
//
        al.set(3, 50);
//        al.remove(1);
//        
        Collections.sort(al);

        System.out.println(al);
    }
}
