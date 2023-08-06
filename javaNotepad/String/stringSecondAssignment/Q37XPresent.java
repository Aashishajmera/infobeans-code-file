// 37. Write a Java program to check if the letter 'x' is present in the word 'String Exercises'

import java.util.Scanner;

class Q37XPresent{
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first string: ");
        String s1 = sc.nextLine();

        boolean flag = true;
        for(int i = 0; i < s1.length(); i++){
            if(s1.charAt(i) == 'x'){
                flag = false;
                break;
            }
        }
        if(flag){
            System.out.println("Not present: ");
        }else{
            System.out.println("Present: ");
        }
    }
}