// 10. Write a Java program to get the contents of a given string as a byte array

import java.util.Scanner;

class Q10ByteArray{
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string value: ");
        String s1 = sc.nextLine();

        char arr[] = s1.toCharArray();

        String storeValue = "";
        for(int i = 0; i < arr.length; i++){
            int value = arr[i];
            storeValue += value + " ";
        }
        System.out.println(storeValue);
    }
}