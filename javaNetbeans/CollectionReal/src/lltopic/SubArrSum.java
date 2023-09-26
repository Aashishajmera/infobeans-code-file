//Q.7 Sub array with given sum
//Given an unsorted array A of size N that contains only non-negative integers, find a continuous sub-array which adds to a given number S.
package lltopic;

import java.util.LinkedList;
import java.util.Scanner;

public class SubArrSum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList ll = new LinkedList();

        System.out.println("Enter size of array: ");
        int size = sc.nextInt();

        System.out.println("Enter " + size + " element: ");

        for (int i = 0; i < size; i++) {
            ll.add(sc.nextInt());
        }
        
        System.out.println("Enter sum: ");
        int target = sc.nextInt();
        
        boolean flag = true;
        for(int i = 0; i < ll.size(); i++){
            int sum = 0;
            int j = i;
            for(; j < ll.size(); j++){
                sum = sum + (int) ll.get(j);
                if(sum == target){
                    flag = false;
                    break;
                }
            }
            if(!flag){
                System.out.println("Index is: "+j +" to "+ (j+1) );
                break;
            }
        }
        
        if(flag){
            System.out.println("Wrong array: ^");
        }
    }
}
