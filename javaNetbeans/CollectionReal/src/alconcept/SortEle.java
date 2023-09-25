package alconcept;

import java.util.ArrayList;
import java.util.Scanner;

public class SortEle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int size = sc.nextInt();
        
        ArrayList<Integer> arr = new ArrayList<>(size);
        System.out.println("Enter "+size +" element: ");
        for(int i = 0; i < size; i++){
            arr.add(sc.nextInt());
        }
        arr.add(88);
        
        System.out.println("Default array element is: ");
        for(int i = 0; i < arr.size(); i++){
            System.out.print(arr.get(i)+" ");
        }
        
        for(int i = 0; i < arr.size(); i++){
            for(int j = 0; j < arr.size() - i -1; j++){
                if(arr.get(j) > arr.get(j+1)){
//                    arr.replaceO(j); = arr.get(j) + arr.get(j+1);
                    
                }
            }
        }
    }
}
