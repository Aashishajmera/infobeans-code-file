
import java.util.Scanner;

public class KthSmallestLargest {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size: ");
        int size = sc.nextInt();

        int arr[] = new int[size];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        // create a object of sortArr
        SortArr sa = new SortArr();
        System.out.println("Default array element is: ");
        sa.printArrElement(arr);
        System.out.println();

        System.out.println("Sort array element is: ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] < arr[j + 1]) {
                    arr[j] = arr[j] + arr[j + 1];
                    arr[j + 1] = arr[j] - arr[j + 1];
                    arr[j] = arr[j] - arr[j + 1];
                }
            }
        }

        sa.printArrElement(arr);
        System.out.println();

//        for(int i = 0; i < arr.length ;i++){
//            System.out.print(arr[i]+" ");
//        }
        boolean flag = false;
        System.out.println("Enter N th Largest: ");
        int k = sc.nextInt();
        System.out.println("Enter N th Smallest: ");
        int n = sc.nextInt();
        for (int i = 0; i < arr.length; i++) {
            int temp = (size - n);
            int temp2 = (k - 1);

            if (i == temp2) {
                System.out.println("N th Largest: " + arr[temp2]);
                flag = true;
            }
            if (temp == i) {
                System.out.println("N th Smallest: " + arr[i]);
                flag = true;
            }
        }
        if (!flag) {
            System.out.println("Index not found: ");
        }
    }
}
