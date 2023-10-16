package Progggg;

import java.util.Arrays;
import java.util.Scanner;

public class KthlargestAndSmallest {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int arr[] = new int[100];

        System.out.println("Enter size of array: ");
        byte size = sc.nextByte();

        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        
        for(int i = 0; i < size; i++){
            int min = arr[i];
            int pos = i;
            for(int j = i+1; j < size; j++){
                if(min > arr[j]){
                    min = arr[j];
                    pos = j;
                }
            }
            arr[pos] = arr[i];
            arr[i] = min;
        }

        
        for(int i = 0; i < size; i++){
            System.out.print(arr[i]+" ");
        }

        System.out.println("Enter k th largest");
        int k = sc.nextInt();
        System.out.println("Enter k th smalest ");
        int s = sc.nextInt();
        if (k < size) {
            int largest = (size - k);
            int smallest = (s-1);
            System.out.println("largest" +k+" element: "+arr[largest]);
            System.out.println("smallest" +s+" element: "+arr[smallest]);
        }else{
            System.out.println("please valid index: ");
        }
    }
}
