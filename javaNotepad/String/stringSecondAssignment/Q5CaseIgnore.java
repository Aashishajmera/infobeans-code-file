// 4. Write a Java program to compare two strings lexicographically Two strings are lexicographically equal if they are the same length and contain the same characters in the same positions

import java.util.Scanner;

class Q5CaseIgnore {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first string value: ");
        String s1 = sc.nextLine();
        System.out.println("Enter second string value: ");
        String s2 = sc.nextLine();

        // convert to array:
        char arr[] = s1.toCharArray();
        char arr2[] = s2.toCharArray();
        boolean flag = false;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == (char) (arr2[i] - 32) || arr[i] == (char) (arr2[i] + 32)) {
                flag = true;
            }
            if (flag == false) {
                System.out.println("Not equal: ");
                break;
            }
        }
        if(flag){
            System.out.println("Equal and case not check: ");
        }
    }
}