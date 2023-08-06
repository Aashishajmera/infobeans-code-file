// 40. Write a Java program to Count Number of Uppercase and Lowercase letters

import java.util.Scanner;

class Q40CheckUpperLower {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string value: ");
        String s1 = sc.nextLine();

        // convert to array:
        int Lcount = 0, Ucount = 0;
        char arr[] = s1.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 65 && arr[i] <= 90) {
                Ucount++;
            } else if (arr[i] >= 97 && arr[i] <= 122) {
                Lcount++;
            }
        }
        System.out.println("Lowercase letter is: " + Lcount);
        System.out.println("Uppercase letter is: " + Ucount);

    }
}