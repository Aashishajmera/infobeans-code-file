// 20. Write a Java program to replace each substring of a given string that matches the given regular expression with the given replacement

import java.util.Scanner;
class Replace{
    public void replaceM(String arr[], String change, String replace){
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == change){
                arr[i] = replace;
            }
        }

        // print 
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
class Q20Replace{
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any string ");
        String s1 = sc.nextLine();
        System.out.println("Enter change value: ");
        String change = sc.nextLine();
        System.out.println("Enter replace value: ");
        String replace = sc.nextLine();

        // split 
       String arr[] = s1.split(" ");

       // create object: 
        Replace obj = new Replace();
        obj.replaceM(arr, change, replace);
    }
}