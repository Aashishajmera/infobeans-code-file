// 22. Write a Java program to get a substring of a given string between two specified positions

import java.util.Scanner;

class Q22SubString{
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string value: ");
        String s1 = sc.nextLine();

        // convert to array: 
        char arr[] = s1.toCharArray();
        String s2 = "";

        System.out.println("Enter first index: ");
        int index1 = sc.nextInt();
        System.out.println("Enter second index: ");
        int index2 = sc.nextInt();

        for(int i = 0; i < arr.length; i++){
            if(i >= index1 && i <= index2){
                s2 += arr[i];
            }
        }

        System.out.println("sub string is: "+s2);
    }
}