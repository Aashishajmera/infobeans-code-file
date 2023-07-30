// 5. Insert element at a specified position of array    // one D array se implement kran hai

import java.util.Scanner;

class Insert {
    int arr1[];
    int index, value;

    // create method input method:
    public void input(Scanner sc) {
        System.out.println("Enter size of array ");
        int size = sc.nextInt();
        int arr1[] = new int[size];
        System.out.println("Enter " + size + " element: ");
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = sc.nextInt();
        }
        System.out.println("Enter index betwween 0 to " + (size - 1));
        int index = sc.nextInt();
        System.out.println("Enter change value: ");
        int value = sc.nextInt();

        this.arr1 = arr1;
        this.index = index;
        this.value = value;
    }

    // output default array:
    public void output() {
        System.out.println("default array elemetn is: ");
        for (int i : arr1) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    // insert element:
    public void insert() {
        for (int i = 0, j = 0; i <= arr1.length; i++) {
            if (index == i) {
                arr1[i] = value;
                j++;
            } else if (index != i && j == 0) {
                arr1[i] = arr1[i];
            } else {
                arr1[i] = arr1[i - 1];
            }

        }
    }

    // display
    public void display() {
       for(int i = 0; i <= arr1.length; i++){
        System.out.println(arr1[i]);
       }
    }
}

class Insert32 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Insert obj = new Insert();
        obj.input(sc);
        obj.output();
        obj.insert();
        obj.display();
    }
}