// 15. Write a Java program to create a character array containing the contents of a string

import java.util.Scanner;

class Q15Contents{
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of arrray: ");
        int size = sc.nextInt();

        char arr[] = new char[size];

        String s2 ="";
        System.out.println("Enter "+size +" character: ");
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.next().charAt(0);
        }

        for(int i = 0; i < arr.length; i++){
            s2 += arr[i];
        }

        System.out.println("given array character element is: ");
        System.out.println(s2);
    }
}