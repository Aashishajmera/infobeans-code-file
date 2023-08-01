import java.util.Scanner;

class Q4PrimeElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter " + size + " element: ");

        // input array:
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        // output array:
        System.out.println("Default array element is: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        // find prime number:
        System.out.println("prime number array element is: ");
        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            for (int j = 2; j <= arr[i] / 2; j++) {
                if (arr[i] % j == 0) {
                    count++;
                    break;
                }
            }
        }
    }
}