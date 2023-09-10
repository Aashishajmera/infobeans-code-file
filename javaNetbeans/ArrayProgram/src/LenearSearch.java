
import java.util.Scanner;

public class LenearSearch {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int size = sc.nextInt();

        int arr[] = new int[size];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter search element: ");
        int ele = sc.nextInt();

        boolean flag = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == ele) {
                flag = true;
                break;
            }
        }
        if (flag) {
            System.out.println("Element found: ");
        } else {
            System.out.println("NOt found: ");
        }

    }
}
