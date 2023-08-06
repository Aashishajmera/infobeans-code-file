// 21. Write a Java program to check whether a given string starts with the contents of another string

import java.util.Scanner;

class CheckStart {
    public boolean checkStart(char arr[], char arr2[]) {
        boolean flag = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[0] == arr2[0]) {
                flag = true;
                break;
            }
        }
        return flag;
    }
}

class Q21CheckContents {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any string :");
        String s1 = sc.nextLine();
        System.out.println("Enter second string: ");
        String s2 = sc.nextLine();

        // convert array:
        char arr[] = s1.toCharArray();
        char arr2[] = s2.toCharArray();

        // create object:
        CheckStart obj = new CheckStart();

        // call method:
        boolean flag = obj.checkStart(arr, arr2);
        System.out.println(flag);
    }
}