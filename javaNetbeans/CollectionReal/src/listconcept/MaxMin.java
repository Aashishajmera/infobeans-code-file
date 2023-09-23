package listconcept;

import java.util.ArrayList;
import java.util.Scanner;

public class MaxMin {

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
        
        int min = arr.get(0);
        int max = arr.get(0);
        
        for(int i = 0; i < arr.size(); i++){
            if(min > arr.get(i)){
                min = arr.get(i);
            }else{
                max = arr.get(i);
            }
        }
        
        System.out.println("Mininum value is: "+min);
        System.out.println("Maximum value is: "+max);
    }
}
