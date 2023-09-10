
import java.util.Scanner;

public class InsertEleNotDele {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array");
        int size = sc.nextInt();
        int arr[] = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Default array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        System.out.println("Enter index");
        int index = sc.nextInt();
        System.out.println("Enter value: ");
        int value = sc.nextInt();

        int arr2[] = new int[size];
        int count = 1;
        int temp;
        for (int i = 0; i < size; i++) {
            if (index == i) {
                arr2[i] = value;
                size++;
            } else if (count == 1) {
                arr2[i] = arr[i];
            }else{
                arr2[i] = arr[i-1];
            }
        }

        for (int i = 0; i < size; i++) {
            System.out.print(arr2[i] + " ");
        }

    }
}
