// 46. Write a program to First alphabet capital of each word in given string

import java.util.Scanner;

class Q46CapitalFirst {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string value: ");
        String s1 = sc.nextLine();

        // convert to array: 
        char arr[] = s1.toCharArray();
        if(arr[0] <= 122 && arr[0] >= 97){
            arr[0] = (char)(arr[0]-32);
        }
        for(int i = 1; i < arr.length; i++){
            if(arr[i] == ' '){
                 if(arr[i+1] <= 122 && arr[i+1] >= 97){
                    arr[i+1] = (char)(arr[i+1]-32);
                 }
            }
        }

        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i]);
        }
    }
}