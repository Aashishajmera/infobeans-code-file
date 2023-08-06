// 26. Write a Java program to Count words in Given String

import java.util.Scanner;

class CountWord {
    public int CountWord(char arr[]) {
        int count = 0;
        for(int i = 0; i < arr.length; i++){
            count++;
            if(arr[i] == ' '){
                count--;
            }
        }
        return count;
    }
}

class Q26CountWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string value: ");
        String s1 = sc.nextLine();

        // convert to array:
        char arr[] = s1.toCharArray();

        // create object:
        CountWord obj = new CountWord();
        int count = obj.CountWord(arr);
        System.out.println("character is: "+count);

    }
}