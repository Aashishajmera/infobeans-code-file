package ReturnRevisionArrrr;

import java.util.Scanner;

public class UpdateArrrrrr {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int arr[] = new int[100];

        System.out.println("Enter size of array: ");
        byte size = sc.nextByte();

        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter index");
        int index = sc.nextInt();

        if (index < size) {
            System.out.println("Enter element: ");
            int element = sc.nextInt();

            for (int i = 0; i < size; i++) {
                if (i == index) {
                    arr[i] = element;
                }
            }

        } else {
            System.out.println("index out of bound: ");
        }
        
        for(int i = 0; i < size; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
