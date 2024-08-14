// package FINAL_JS_REVESION.JAVA.Arrayyyyy;

import java.util.Scanner;

public class Insert {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter size");
    int size = sc.nextInt();
    int arr[] = new int[size];
    
    System.out.println("Enter element " + size);
    for (int i = 0; i < arr.length; i++) {
      arr[i] = sc.nextInt();
    }

    System.out.println("Enter index between 1 to 5");
    int index = sc.nextInt();

    if (0 > index || index > size) {
      System.out.println("invalid position");
      return ;
    }
    
    System.out.println("Enter value");
    int value = sc.nextInt();
    
    int newArr[] = new int[arr.length + 1];
    
    for(int i = 0; i < index; i++){
        newArr[i] = arr[i];
    }
    
    newArr[index] = value;
    
    for(int i = index; i < arr.length; i++){
        newArr[i+1] = arr[i];
    }
    
    for(int a: newArr){
        System.out.println(a +" ");
    }
  }
}
