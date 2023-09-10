
import java.util.Scanner;

public class InsertEle {

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

        System.out.println("Enter index");
        int index = sc.nextInt();
        System.out.println("Enter value: ");
        int value = sc.nextInt();
        boolean flag = true;
        for (int i = 0; i < arr.length; i++) {
            if (index == i) {
                arr[i] = value;
                flag = false;
            }
        }

        System.out.println("Update array: ");
        if (flag) {
            System.out.println("array index is outofbound: ");
        } else {
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }
        }

    }
}
