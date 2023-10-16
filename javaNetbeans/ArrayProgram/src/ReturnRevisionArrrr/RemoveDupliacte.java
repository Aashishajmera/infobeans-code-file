package ReturnRevisionArrrr;

import java.util.Scanner;

public class RemoveDupliacte {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int arr[] = new int[100];

        System.out.println("Enter size of array: ");
        byte size = sc.nextByte();

        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        

        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
