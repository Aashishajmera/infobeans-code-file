// 46. Write a program to First alphabet capital of each word in given string

import java.util.Scanner;

class Q46CapitalFirst{
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string value: ");
        String s1 = sc.nextLine();

        String s2[] = s1.split(" ");

        for(int i = 0; i < s2.length; i++){
            for(int j = 0; j < 1; j++){
                if(s2[i].charAt(j) >= 97 && s2[i].charAt(j) <= 122){
                   s2[i].charAt(j) = (char)(s2[i].charAt(j)-32);
                }
            }
        }
    }
}