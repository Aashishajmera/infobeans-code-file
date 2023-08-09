// 8. Write a Java program to check whether a given string ends with the contents of another string

import java.util.Scanner;

class Q8AnotherStr{
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first string: ");
        String s1 = sc.nextLine();
        System.out.println("Enter search value: ");
        String search = sc.nextLine();
        boolean flag = true;

        // convert to array: 
        String arr[] = s1.split(" ");
        for(int i = 0; i < arr.length; i++){
            if(arr[i].equals(search)){
                flag = false;
                break;
            }
        }
        if(flag){
            System.out.println("Not found: ");
        }else{
            System.out.println("found: ");
        }
    }
}