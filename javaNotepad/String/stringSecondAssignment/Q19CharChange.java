// 19. Write a Java program to replace a specified character with another character

import java.util.Scanner;
class ReplaceChar{
    public char[] replaceChar(char arr[], int index, char value){
        for(int i = 0; i < arr.length; i++){
            if(i == index){
                arr[i] = value;
            }
        }
        return arr;
    }
}
class Q19CharChange{
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string: ");
        String s1 = sc.nextLine();
        System.out.println("Enter index: ");
        int index = sc.nextInt();
        System.out.println("Enter character: ");
        char value = sc.next().charAt(0);

        // convert string to array: 
        char arr[] = s1.toCharArray();
        // create object: 
        ReplaceChar obj = new ReplaceChar();

        // call method: 
       char arr2[] = obj.replaceChar(arr, index, value);
    //    for(char i: arr2){
    //     System.out.print(i);
    //    }

    for(int i = 0;  i< arr2.length; i++){
        System.out.println(arr2[i]);
    }

    }
}