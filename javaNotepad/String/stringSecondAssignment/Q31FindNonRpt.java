// 31. Write a Java program to find first non repeating character in a string

import java.util.Scanner;

class Q31FindNonRpt{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first string: ");
        String s1 = sc.nextLine();
        System.out.println("Enter second String: ");
        String s2 = sc.nextLine();

        // convert to array: 
        char arr[] = s1.toCharArray();
        char arr2[] = s2.toCharArray();
        boolean flag = false;
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr2.length; j++){
                if(arr[i] == arr2[j]){
                    flag = true;
                    break;
                }
            }
            if(flag == false){
                System.out.println("First non repeat character is: "+arr[i]);
            }
        }
        if(flag){
            System.out.println("Every character same: ");
        }
    }
}