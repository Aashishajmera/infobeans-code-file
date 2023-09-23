package listconcept;

import java.util.ArrayList;
import java.util.Scanner;

public class InsertEle {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int size = sc.nextInt();

        ArrayList<Integer> arr = new ArrayList<>(size);
        ArrayList<Integer> arr2 = new ArrayList<>(size);
        System.out.println("Enter " + size + " element: ");
        for (int i = 0; i < size; i++) {
            int value = sc.nextInt();
            arr.add(value);
        }

        System.out.println("Default array element is: ");
        for (int i = 0; i < arr.size(); i++) {
            System.out.print(arr.get(i) + " ");
        }

        System.out.println("Enter index: ");
        int index = sc.nextInt();
        System.out.println("Enter value: ");
        int value = sc.nextInt();
        boolean flag = false;
        for (int i = 0; i < arr.size(); i++) {
            if (i == index) {
                flag = true;
                arr2.add(value);
            } else {
                arr2.add(arr.get(i));
            }
        }

        if (flag == false) {
            System.out.println("index not found: ");
        } else {
            System.out.println("Update array element is: ");
            for (int i = 0; i < arr2.size(); i++) {
                System.out.print(arr2.get(i) + " ");
            }
        }
    }
}
