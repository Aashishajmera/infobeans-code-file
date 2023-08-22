// 32. Write a Java program to print after removing duplicates from a given string

import java.util.Scanner;

class RemoveDuplicate {
    public void removeDuplicate(char arr[]) {
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            int check = 0;
            for (int j = i - 1; j >= 0; j--) {
                if (arr[i] == arr[j]) {
                    check++;
                }
            }
            if (check == 0) {
               System.out.print(arr[i]+" ");
            }
        }
    }
}

class Q32RemoveDuplicate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string value: ");
        String s1 = sc.nextLine();

        char arr[] = s1.toCharArray();
        // int size = arr.length;
        // char arr2[] = new char[size];

        // create object:
        RemoveDuplicate obj = new RemoveDuplicate();
        obj.removeDuplicate(arr);
    }
}