// 49. Write a program to Check given strings are Anagram or not

import java.util.Scanner;

class Q49Anagram{
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first string: ");
        String s1 = sc.nextLine();
        System.out.println("Enter second string: ");
        String s2 = sc.nextLine();

        // convert to array: 
        char arr[] = s1.toCharArray();
        char arr2[] = s2.toCharArray();
        boolean flag = false;
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr.length; j++){
                if(arr[i] == arr2[j]){
                    flag = true;
                    break;
                }
            }
            if(flag == false){
                break;
            }
        }
        if(flag == false){
            System.out.println("Not anagram: ");
        }else{
            System.out.println("This string is anagram: ");
        }
    }
}