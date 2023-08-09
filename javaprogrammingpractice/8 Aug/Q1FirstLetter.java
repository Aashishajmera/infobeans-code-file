// 1. wap to ask string from user and convert first letter of each word to uppercase 

import java.util.Scanner;

class Q1FirstLetter{
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string value: ");
        String s1 = sc.nextLine();

        // split method: 
        char arr[] =  s1.toCharArray();
        if(arr[0] >= 97 && arr[0] <= 122){
            arr[0] = (char)(arr[0]-32);        }
        for(int i = 1; i < arr.length; i++){
            if(arr[i] == ' '  && arr[i] == ' '){
                if(arr[i+1] <= 122 && arr[i+1] >= 97){
                    arr[i+1] = (char)(arr[i+1]-32);
                }
            }
        }

        for(char element: arr){
            System.out.print(element);
        }
    }
}