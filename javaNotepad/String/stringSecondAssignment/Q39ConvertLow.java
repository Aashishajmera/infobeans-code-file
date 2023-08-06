// 39. Write a Java program to Given string Convert Uppercase to Lowercase

import java.util.Scanner;

class Q39ConvertLow{
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string value: ");
        String s1 =sc.nextLine();

        // convert to array: 
        char arr[] = s1.toCharArray();

         for(int i = 0; i < arr.length; i++){
            if(arr[i] >= 65 && arr[i] <= 90){
                arr[i] = (char)(arr[i]+32);
            }
        }

        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i]+" ");
        }

        // for(int i = 0; i < s1.length(); i++){
        //     if(s1.charAt(i) >= 65 && s1.charAt(i) <= 90){
        //         s1.charAt(i) = (char)(s1.charAt(i)+32);
        //     }
        // }
    }
}