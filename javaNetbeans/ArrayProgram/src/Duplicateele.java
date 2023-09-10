
import java.util.Scanner;

public class Duplicateele {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int size = sc.nextInt();

        int arr[] = new int[size];
        int arr2[] = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        
        int i, j, z = 0;
        for (i = 0; i < arr.length; i++) {
            for (j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    break;
                }

            }
            if (i == j) {
//                System.out.print(arr[i] + " ");
                arr2[z] = arr[i];
                z++;
            } else {
                size--;

            }
        }

        for (int k = 0; k < size; k++) {
            System.out.print(arr2[k] + " ");
        }
    }
}
