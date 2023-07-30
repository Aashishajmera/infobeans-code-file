// 9. Find max & min element in array 

import java.util.Scanner;

class FindMaxMin {
    int arr[], max, min;

    // create method:
    public void input(Scanner sc) {
        System.out.println("Enter size of array: ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter " + size + " element: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        this.arr = arr;

    }

    // output
    public void output() {
        int max = arr[0];
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        this.max = max;
        this.min = min;
        System.out.println("Max value is: " + max);
        System.out.println("Min value is: " + min);
    }
}

class FindMaxMin3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        FindMaxMin obj = new FindMaxMin();
        obj.input(sc);
        obj.output();
        System.out.println("max value is: "+obj.max);
        System.out.println("min value is: "+obj.min);
    }
}