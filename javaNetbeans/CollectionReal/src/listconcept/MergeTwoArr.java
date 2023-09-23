package listconcept;

import java.util.ArrayList;
import java.util.Scanner;

public class MergeTwoArr {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int size = sc.nextInt();

        ArrayList<Integer> arr = new ArrayList<>(size);

        System.out.println("Enter " + size + " element: ");
        for (int i = 0; i < size; i++) {
            int value = sc.nextInt();
            arr.add(value);
        }

        System.out.println("Enter size of second array: ");
        int size2 = sc.nextInt();

        ArrayList<Integer> arr2 = new ArrayList<>(size2);

        System.out.println("Enter " + size2 + " element: ");
        for (int i = 0; i < size2; i++) {
            arr2.add(sc.nextInt());
        }

        System.out.println("Default array1 element is: ");
        for (int i = 0; i < arr.size(); i++) {
            System.out.print(arr.get(i) + " ");
        }

        System.out.println("Default array1 element is: ");
        for (int i = 0; i < arr2.size(); i++) {
            System.out.print(arr2.get(i) + " ");
        }
        System.out.println();
        int size3 = size + size2;
        ArrayList<Integer> arr3 = new ArrayList<>(size3);
        int k = 0;
        for (int i = 0; i < size3; i++) {
            if (i < arr.size()) {
                arr3.add(arr.get(i));
            } else {
                arr3.add(arr2.get(k));
                k++;
            }
        }

        System.out.println("Merge array element is: ");
        for(int i = 0; i < arr3.size(); i++){
            System.out.print(arr3.get(i)+" ");
        }
    }
}
