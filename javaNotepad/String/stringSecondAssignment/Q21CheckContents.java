// 21. Write a Java program to check whether a given string starts with the contents of another string

import java.util.Scanner;

class CheckStart {
    public boolean checkStart(String arr[], String search) {
        boolean flag = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals(search)) {
                flag = true;
                break;
            }
        }
        return flag;
    }
}

class Q21CheckContents {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any string :");
        String s1 = sc.nextLine();
        System.out.println("Enter search element: ");
        String search = sc.nextLine();
        
        String arr[] = s1.split(" ");

        // create object:
        CheckStart obj = new CheckStart();

        // call method:
        boolean flag = obj.checkStart(arr, search);
        System.out.println(flag);
    }
}