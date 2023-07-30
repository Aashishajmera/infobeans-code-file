import java.util.Scanner;

class BinarySearch {
    int arr[];
    int mid;

    public void input(Scanner sc) {
        System.out.println("Enter size of array ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        this.arr = arr;
        System.out.println("Enter " + size + " element: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
    }

    public void display() {
        System.out.println("default array element is: ");
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    // sorting array element by bubble sort (assending order: )
    public void bubbleSort() {
        System.out.println("Assending order array element is: ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    arr[j] = arr[j] + arr[j + 1];
                    arr[j + 1] = arr[j] - arr[j + 1];
                    arr[j] = arr[j] - arr[j + 1];
                }
            }
        }
        // print array:
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    // binaray search:
    public void binary(Scanner sc) {
        boolean flag = false;
        System.out.println("Enter find value: ");
        int value = sc.nextInt();
        int start = 0, end = arr.length;
        for (int i = 0; i < arr.length; i++) {
            mid = (start + end) / 2;
            if (arr[mid] == value) {
                System.out.println("found value: ");
                flag = true;
                break;
            } else if (arr[mid] < value) {
                start = mid + 1;
            } else {
                end = mid - 1;

            }

        }
        if (flag == false) {
            System.out.println("Not found: ");
        }
    }
}

class BinarySer1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BinarySearch obj = new BinarySearch();
        obj.input(sc);
        obj.display();
        obj.bubbleSort();
        obj.binary(sc);
    }
}