package ReturnRevisionArrrr;

import java.util.Scanner;

public class DeleteEleeee {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int arr[] = new int[100];

        System.out.println("Enter size of array: ");
        byte size = sc.nextByte();

        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter delete element");
        int delete = sc.nextInt();
        boolean flag = false;
        for (int i = 0; i < size - 1; i++) {
            if (arr[i] == delete) {
                arr[i] = arr[i + 1];
                flag = true;
            } else if (flag) {
                arr[i] = arr[i + 1];
            }
        }

        if (flag == false) {
            System.out.println("Element not found: ");
        } else {
            for (int i = 0; i < size - 1; i++) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}
