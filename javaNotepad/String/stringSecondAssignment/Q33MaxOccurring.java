// 33. Write a Java program to find the maximum occurring character in a string

import java.util.Scanner;

class Q33MaxOccurring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string value: ");
        String s1 = sc.nextLine();

        int count = 1;
        int ans = 1;
        char value = ' ';
        int check = 0;
        // convert array:
        char arr[] = s1.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            for (int j = i - 1; j >= 0; j--) {
                if (arr[i] == arr[j]) {
                    check++;
                    break;
                }
            }
            if (check == 0) {
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[i] == arr[j]) {
                        count++;
                    }
                }
                if (ans < count) {
                    ans = count;
                    value = arr[i];
                    System.out.println(ans);
                }
            }
        }

        System.out.println("Maximum time repeat character is: " + value + " repeat " + ans + " time");
    }
}