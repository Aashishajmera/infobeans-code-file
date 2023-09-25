
package alconcept;

import java.util.ArrayList;
import java.util.Scanner;

public class SumEle {
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
        
        int sum = 0;
        
        for(int i = 0; i < arr.size(); i++){
            sum+=arr.get(i);
        }
        System.out.println();
        
        System.out.println("Element sum is: "+sum);
    }
}
