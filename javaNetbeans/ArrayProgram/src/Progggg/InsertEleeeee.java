package Progggg;

import java.util.Scanner;

public class InsertEleeeee {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[100];
        System.out.println("Enter value:");
        int size = sc.nextInt();

        System.out.println("Enter " + size + " element");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        // print default array: 
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println("Enter index..");
        int index = sc.nextInt();

        if (index < size) {
            System.out.println("Enter element: ");
            int element = sc.nextInt();
            
            for(int i = size-1; i >= index; i--){
                arr[i+1] = arr[i];
                if(i == index){
                    arr[i] = element;
                    break;
                }
            }
            
            for(int i = 0; i <= size; i++){
                System.out.print(arr[i]+" ");
            }
            
//            int arr2[] = new int[size+1];
//            boolean flag = true;
//            for(int i = 0; i < arr2.length; i++){
//                if(i == index){
//                    arr2[i] = element;
//                    flag = false;
//                }else if(flag){
//                    arr2[i] = arr[i];
//                }else{
//                    arr2[i] = arr[i-1];
//                }
//            }
//            
//            for (int i = 0; i < arr2.length; i++) {
//                System.out.print(arr2[i] + " ");
//            }


        } else {
            System.out.println("index out of bond: ");
        }
    }
}
