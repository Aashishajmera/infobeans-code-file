package ReturnRevisionArrrr;

import java.util.Scanner;

public class DeleteMultipul {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int arr[] = new int[100];

        System.out.println("Enter size of array: ");
        byte size = sc.nextByte();

        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter delete element: ");
        int delete = sc.nextInt();

        boolean flag = true;
        for (int i = 0; i < size; i++) {
            if (delete == arr[i]) {
                flag = false;
                for (int j = i + 1; j < size; j++) {
                    arr[j - 1] = arr[j];
                }
                i--;
                size--;
            }
        }

        if (flag) {
            System.out.println("NOt found; ");
        } else {
            for (int i = 0; i < size; i++) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}
