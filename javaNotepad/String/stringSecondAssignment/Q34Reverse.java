// 34. Write a Java program to reverse words in a given string

import java.util.Scanner;

class Q34Reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // System.out.println("Enter string value: ");
        String s1 = "Aashish ajmera";

        // split method:
        String arr[] = s1.split(" ");

        for (int i = 0; i < arr.length; i++) {
            String s2 = " ";
            for (int j = 0; j < arr[i].length(); j++) {
                char r = arr[i].charAt(j);
                s2 = r + s2;
            }
            System.out.print(s2+" ");
        }
    }
}