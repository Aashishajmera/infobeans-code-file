// 7. Write a Java program to test if a given string contains the specified sequence of char values

import java.util.Scanner;

class Q7SpecifiedSequence{
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string value: ");
        String s1 = sc.nextLine();
        System.out.println("Enter search value: ");
        String search = sc.nextLine();
        boolean flag = false;

        String arr[] = s1.split(" ");

        for(int i = 0; i < arr.length; i++){
            if(arr[i].equals(search)){
                flag = true;
                break;
            }
        }
        if(flag == true){
            System.out.println("word found: ");
        }else{
            System.out.println("Not found: ");
        }
    }
}