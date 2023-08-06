// 17. Write a Java program to convert all the characters in a string to Uppercas

import java.util.Scanner;
class UpperCase{
    public char[] upperCase(char arr[]){
        for(int i = 0; i < arr.length; i++){
            if(arr[i] >= 90 && arr[i] <= 120){
                arr[i] = (char)(arr[i]-32);
            }
        }
        return arr;
    }
}

class Q17UpperCase{
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string value: ");
        String s1 = sc.nextLine();

        // convert array: 
        char arr[] = s1.toCharArray();

        // create object: 
        UpperCase obj = new UpperCase();
        char upperCase[] = obj.upperCase(arr);
        for(int i = 0; i < upperCase .length; i++){
            System.out.print(upperCase[i]);
        }
    }
}