// 42. Write a program to Replace string with another string in java using String.replace() method

import java.util.Scanner;
class Replace{
    String arr[];

    // default constructor: 
    public Replace(){

    }
    // create constructor: 
    public Replace(String arr[]){
        this.arr = arr;
    }
    public void replaceWord(String arr[], String s2, String s3){
        for(int i = 0; i < arr.length; i++){
            if(arr[i].equals(s2)){
                arr[i] = s3;
            }
        }
    }

    public void display(){
        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
    }
}
class Q42Replace1{
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string value: ");
        String s1 = sc.nextLine();
        System.out.println("Enter change value: ");
        String s2 = sc.nextLine();
        System.out.println("Enter input value: ");
        String s3 = sc.nextLine();

        String arr[] = s1.split(" ");

        // create object: 
        Replace obj = new Replace(arr);
        obj.replaceWord(arr, s2, s3);
        obj.display();
    }
}