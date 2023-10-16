/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Progggg;

import java.util.Scanner;

public class BinarySEarrrr {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int arr[] = new int[100];

        System.out.println("Enter size of array: ");
        byte size = sc.nextByte();

        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter search element: ");
        int search = sc.nextInt();
        boolean flag = true;
        int low = 0, high = size;
        for (int i = 0; i < size; i++) {
            int mid = (low + high) / 2;
            if (arr[i] == search) {
                System.out.println("Element found: ");
                flag = false;
                break;
            } else if (arr[mid] < search) {
                low = mid + 1;
            }else{
                high = mid -1;
            }
        }
        
        if(flag){
            System.out.println("Not found");
        }
    }
}
