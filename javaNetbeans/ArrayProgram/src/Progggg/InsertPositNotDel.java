/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Progggg;

import java.util.Scanner;

/**
 *
 * @author hp
 */
public class InsertPositNotDel {

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
        
        
        if(index < size){
            System.out.println("Enter value");
            int element = sc.nextInt();
            
            for(int i = 0; i < size; i++){
                if(i == index){
                    arr[i] = element;
                    break;
                }
            }
            
            for(int i = 0; i < size; i++){
                System.out.print(arr[i]+" ");
            }
            
//            int arr2[] = new int[size];
//            
//            for(int i = 0; i < size; i++){
//                if(i == index){
//                    arr2[i] = element;
//                }else{
//                    arr2[i] = arr[i];
//                }
//            }
//         
//            for(int i = 0; i < arr2.length; i++){
//                System.out.print(arr2[i]+" ");
//            }
        }
    }
}
