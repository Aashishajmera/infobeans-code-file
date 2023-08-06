// 2. Write a Java program to get the character at the given index within the String

import java.util.Scanner;

class CharAt {
  public void charAt(char arr[], int index) {
    int c = 0;
    for (int i = 0; i < arr.length; i++) {
      if (index == i) {
        c++;
        System.out.println(arr[i]);
      }
    }
    if(c == 0){
        System.out.println("-1");
    }
  }
}

class Q2IndexOfChar {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter string value: ");
    String s1 = sc.nextLine();
    System.out.println("Enter a index: ");
    int index = sc.nextInt();

    // convert s1 String to array
    char arr[] = s1.toCharArray();

    // create object:
    CharAt obj = new CharAt();
    obj.charAt(arr, index);

   
  }
}