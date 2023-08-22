// 25. Write a Java program to return the sum of the digits present in the given string.
// If there is no digits the sum return is 0

import java.util.Scanner;

class Q25PresentOrNot{
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any string value and integer: ");
        String s1 = sc.nextLine();

        // convert to array:
        char arr[] = s1.toCharArray();
        
        
        int sum = 0;
        // int rSum = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] <= 57 && arr[i] >= 48){
                sum += arr[i]-'0';
                // rSum += Integer.parseInt(sum);
            }
        }
        System.out.println("String integer sum is: "+sum);
    }
}