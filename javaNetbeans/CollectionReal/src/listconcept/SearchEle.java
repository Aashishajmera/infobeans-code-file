package listconcept;

import java.util.ArrayList;
import java.util.Scanner;

public class SearchEle {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int size = sc.nextInt();
        
        ArrayList<Integer> arr = new ArrayList<>(size);
        System.out.println("Enter "+size +" element: ");
        for(int i = 0; i < size; i++){
            int value = sc.nextInt();
            arr.add(value);
        }
        
        System.out.println("Default array element is: ");
        for(int i = 0; i < arr.size(); i++){
            System.out.print(arr.get(i)+" ");
        }
        
        System.out.println("Enter search element: ");
        int element = sc.nextInt();
        boolean flag = false;
        for(int i = 0; i < arr.size(); i++){
            if(arr.get(i) == element){
                flag = true;
                break;
            }
        }
        if(flag){
            System.out.println("Element found: ");
        }else{
            System.out.println("Element not found: ");
        }
    }

}
