import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

class OccuranceNum {
    public static void main(String[] args) {
        int check = -1;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter " + n + " element: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < arr.length; i++) {
            int count = 1;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    arr[j] = -1;
                    count++;
                }
                if (arr[i] == -1) {
                    break;
                }
            }
            if (arr[i] != -1) {
                System.out.println(arr[i] + " repeat time " + count);
            }
        }
    }
}