// 9. Write a Java program to check whether two String objects contain the same data

import java.util.Scanner;

class Q9SameData {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first string value: ");
        String s1 = sc.nextLine();
        System.out.println("Enter second string value: ");
        String s2 = sc.nextLine();
        boolean flag = false;

        // convert to array: 
        char arr[] = s1.toCharArray();
        char arr2[] = s2.toCharArray();

        for(int i = 0; i < arr.length; i++){
           if(arr[i] != arr2[i]){
                flag = true;
                break;
           }
        }
        if(flag){
            System.out.println("Content are not same: ");
        }else{
            System.out.println("Content are same: ");
        }
    }
}