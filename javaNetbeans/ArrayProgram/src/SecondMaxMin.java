
import java.util.Scanner;

public class SecondMaxMin {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int size = sc.nextInt();
        int arr[] = new int[size];

        System.out.println("Enter " + size + " element: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int max = -2147483648;
        int smax = -2147483648;
        int min = 2147483647;
        int smin = 2147483647;
        for (int j = 0; j < arr.length; j++) {
            if (max < arr[j]) {
                smax = max;
                max = arr[j];

            } else if (smax < arr[j] && arr[j] != max) {
                smax = arr[j];
            }
            if (min > arr[j]) {
                min = smin;
                smin = arr[j];
            } else if (smin > arr[j] && arr[j] != min) {
                smin = arr[j];
            }
        }
        System.out.println("Minimum: " + min);
        System.out.println("Second minimum: " + smin);
        System.out.println("Maximum: " + max);
        System.out.println("Second maximum: " + smax);
    }
}
