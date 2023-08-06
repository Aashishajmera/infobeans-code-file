// ===11. Remove the duplicate element

import java.util.Scanner;

class Remove {
    int size;
    int arr[], arr2[], n;

    // input array element:
    public void input(Scanner sc) {
        int arr[] = new int[50];
        System.out.println("Enter size of array: ");
        int size = sc.nextInt();
        this.n = size;
        int arr2[] = new int[n];
        this.arr2 = arr2;
        this.arr = arr;
        this.size = size;
        System.out.println("Enter " + size + " element: ");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
    }

    // print array element:

    public void output() {
        System.out.println("default array element is: ");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    // remove duplicate element:
    public void duplicateElement(int delete) {
        int k = 0;
        for (int i = 0; i < size; i++) {
            if (delete != arr[i]) {
                arr2[k] = arr[i];
                k++;
            }
            if (delete == arr[i]) {
                n--;
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.print(arr2[i] + " ");
        }
    }

}

class Q11RemoveDuplicate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Remove obj = new Remove();
        // obj.input(sc);
        // obj.output();
        // obj.duplicateElement();

        System.out.println("Enter size of array: ");
        int size = sc.nextInt();

        int arr[] = new int[size];

        int n = size;
        int arr2[] = new int[n];

        System.out.println("Enter " + size + " element: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            int k = 0;
            for (int j = i - 1; j >= 0; j--) {
                if (arr[i] == arr[j]) {
                    n--;
                    k++;
                }
            }

            if (k == 0) {
                arr2[index] = arr[i];
                index++;
            }
        }
        System.out.println("delete duplicate element: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr2[i] + " ");
        }

    }
}