// 47. Write a program to Convert a character array to string

import java.util.Scanner;

class Q47ConvertCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of char type array ");
        int size = sc.nextInt();

        char arr[] = new char[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.next().charAt(0);
        }
       String s1 = "";
       for(int i = 0; i < arr.length; i++){
            s1 += arr[i];
       }

       System.out.println(s1);
    }
}
