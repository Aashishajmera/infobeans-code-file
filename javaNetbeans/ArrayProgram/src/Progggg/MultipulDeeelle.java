package Progggg;

import java.util.Scanner;

public class MultipulDeeelle {

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
//========================================================================================
//        System.out.println("Enter delete element");
//        int delete = sc.nextInt();
//        int size2 = size;
//
//        int arr2[] = new int[size2];
//        int ind = 0;
//
//        for (int i = 0; i < size; i++){
//            if (arr[i] != delete) {
//                arr2[ind] = arr[i];
//                ind++;
//            } else {
//                size2--;
//            }
//        }
//
//        for (int i = 0; i < size2; i++) {
//            System.out.print(arr2[i] + " ");
//        }
//========================================================================================
        System.out.println("Enter delete element");
        int delete = sc.nextInt();

        for (int i = 0; i < size; i++) {
            if (arr[i] == delete) {
                for (int j = i + 1; j < size; j++) {
                    arr[j - 1] = arr[j];
                }
                size--;
                i--;
            }
        }

        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }

//=====================================NOT-WORDK===================================================
//        System.out.println("Enter delete element: ");
//        int delete = sc.nextInt();
//        int j ;
//        for (int i = 0; i < size; i++) {
//           
//            for (j = 0; j < size; j++) {
//                if (arr[j] == arr[j]) {
//                    break;
//                }
//            }
//            if(i==j){
//                System.out.print(arr[i]+" ");
//            }
//        }
    }
}
