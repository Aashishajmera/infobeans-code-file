// 38. Write a Java program to Given string Convert Lowercase to Uppercase

import java.util.Scanner;
class UpperCase{
    public void upperCase(char arr[]){ 
        for(int i = 0; i < arr.length; i++){
            if(arr[i] >= 97 && arr[i] <= 122){
                arr[i] = (char)(arr[i]-32);
            }
        }
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
class Q38ConvertUpper{
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string: ");
        String s1 = sc.nextLine();

        // convert to array: 
        char arr[] = s1.toCharArray();
        // create object: 
        UpperCase obj = new UpperCase();
        obj.upperCase(arr);
    }
}