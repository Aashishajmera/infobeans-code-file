
import java.util.Scanner;

public class SortD2 {

    public static void printEle(byte arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static byte[] m1sortElement(Scanner sc) {
        System.out.println("Enter size of array: ");
        int size = sc.nextInt();
        byte[] arr = new byte[size];
        System.out.println("Enter " + size + " element: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextByte();
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {

                if (arr[j] < arr[j + 1]) {
                    arr[j] = (byte) (arr[j] + arr[j + 1]);
                    arr[j + 1] = (byte) (arr[j] - arr[j + 1]);
                    arr[j] = (byte) (arr[j] - arr[j + 1]);
                }
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        byte arr[] = SortD2.m1sortElement(sc);

        SortD2.printEle(arr);
    }
}
