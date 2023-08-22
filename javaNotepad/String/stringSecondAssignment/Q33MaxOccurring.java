// 33. Write a Java program to find the maximum occurring character in a string

import java.util.Scanner;

class Q33MaxOccurring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string value: ");
        String s1 = sc.nextLine();

        int ans = 0;
        char value = ' ';
        // convert array:
        char arr[] = s1.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            int count = 1;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }
            if (ans < count) {
                ans = count;
                value = arr[i];
            }
        }

        System.out.println("Maximum " + ans + " time repeat character " + value);
    }
}