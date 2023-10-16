/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Progggg;

import java.util.Scanner;

public class DeleteOne {

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 3, 67, 8};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value");
        int element = sc.nextInt();
        boolean flag = false;
        int count  = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i]== element){
                count++;
            }
        }
        for(int i = 0; i < arr.length - 1; i++){
            if(arr[i] == element){
                arr[i] = arr[i+1];
                flag = true;
            }else if(flag){
                arr[i] = arr[i+1];
            }
        }
        
        for(int i = 0; i < arr.length-1; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
