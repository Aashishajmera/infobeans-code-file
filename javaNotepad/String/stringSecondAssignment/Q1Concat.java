// 1. Write a Java program to concatenate Two strings

import java.util.Scanner;
class Concat{
    public String concat(String s1, String s2){
        String s3 = s1+s2;
        return s3;
    }
}
class Q1Concat{
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first string value: ");
        String s1 = sc.nextLine();
        System.out.println("Enter second string value: ");
        String s2 = sc.nextLine();

        // create object: 
        Concat obj = new Concat();
        
        // call method: 
        String s3 = obj.concat(s1, s2);

		
        for(int i = 0; i < s3.length(); i++){
            System.out.print(s3.charAt(i));
        }
	
		
    }
}