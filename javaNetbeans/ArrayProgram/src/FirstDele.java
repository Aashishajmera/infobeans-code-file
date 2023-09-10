
import java.util.Scanner;

public class FirstDele {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array");
        int size = sc.nextInt();
        int arr[] = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter delete ele");
        int ele = sc.nextInt();

//        1st way
        for (int i = 0; i < size; i++) {
            if (arr[i] == ele) {
                for (int j = i; j < size - 1; j++) {
                    arr[j] = arr[j + 1];
                }
                size--;
                i--;
//                break;
            }
        }

        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
//--------------------------------------------------------------------------------------------
//        2nd way
//        int k = 0;
//        int count = 1;
//        boolean flag = true;
//        int n = size;
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] != ele ) {
//                arr[k] = arr[i];
//                k++;
//            }
//            if (arr[i] == ele && count == 1) {
//                n--;
//                count++;
//            } else if (arr[i] == ele && count != 1) {
//                arr[k] = arr[i];
//                k++;
//            }
//        }
//        if (n == size) {
//            System.out.println("Element not found: ");
//        } else {
//            for (int i = 0; i < n; i++) {
//                System.out.print(arr[i] + " ");
//            }
//        }
//----------------------------------------------------------------------------------------
//         3rd way
//        int k = 0;
//        int count = 1;
//        boolean flag = true;
//        int n = size;
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] != ele) {
//                arr[k] = arr[i];
//                k++;
//            } else {
//                n--;
//            }
//        }
//        if (n == size) {
//            System.out.println("Element not found: ");
//        } else {
//            for (int i = 0; i < n; i++) {
//                System.out.print(arr[i] + " ");
//            }
//        }
    }
}
