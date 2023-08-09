// 4. Write a Java program to compare two strings lexicographically Two strings are lexicographically equal if they are the same length and contain the same characters in the same positions

import java.util.Scanner;

class Lexicographically{
    public void lexicographically(char arr[], char arr2[]){
        boolean flag = true;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] != arr2[i]){
                flag = false;
                break;
            }
        }
        if(flag){
            System.out.println("lexicographically match: ");
        }else{
            System.out.println("Not match: ");
        }
    }
}
class Q4Lexicographically{
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first string value: ");
        String s1 = sc.nextLine();
        System.out.println("Enter second string value: ");
        String s2 = sc.nextLine();
        
        // convert to array: 
        char arr[] = s1.toCharArray();
        char arr2[] = s2.toCharArray();

        // create object: 
        Lexicographically obj = new Lexicographically();
        obj.lexicographically(arr, arr2);

    }
}