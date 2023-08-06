// 29. Write a Java program to Reverse Each Word of a String

import java.util.Scanner;

class Reverse{
    public String reverse(String s1){
        String s2 = "";
        for(int i = s1.length() - 1; i >= 0; i--){
            s2 += s1.charAt(i);
        }
        return s2;
    }
}
class Q29Reverse{
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string value: ");
        String s1 = sc.nextLine();

        // create object: 
        Reverse obj = new Reverse();
        String s2 = obj.reverse(s1);

        System.out.println("Reverse string is: "+s2);
    }
}