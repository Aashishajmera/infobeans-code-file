// 35. Write a Java program to find maximum between two string

import java.util.Scanner;

class Q35Max{
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first string : ");
        String s1 = sc.nextLine();
        System.out.println("Enter second string: ");
        String s2 = sc.nextLine();
        int count = 0, count2 = 0;
        for(int i = 0; i < s1.length(); i++){
            count++;
        }
        for(int j = 0; j < s2.length(); j++){
            count2++;
        }
        if(count < count2){
            System.out.println(s2 +" is greater than "+s1);
        }else{
            System.out.println(s1 +" is greater than "+s2);
        }
    }
}