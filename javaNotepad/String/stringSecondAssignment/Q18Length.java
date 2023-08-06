// 18. Write a java program to get the length of a given string

import java.util.Scanner;

class Length {
    public int length(char arr[]) {
        int count = 0;
        for (char c : arr) {
            count++;
        }
        return count;
    }
}

class Q18Length {
    public static void main(String[] args) {
        String s1 = "Aashish ajmera";

        // convert string to array:
        char arr[] = s1.toCharArray();

        // create object:
        Length obj = new Length();
        int length = obj.length(arr);
        System.out.println("length is: " + length);
    }
}