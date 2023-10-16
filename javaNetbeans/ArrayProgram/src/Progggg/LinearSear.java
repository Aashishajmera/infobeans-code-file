package Progggg;

import java.util.Scanner;

public class LinearSear {

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
        for (int i = 0; i < size; i++) {
            if (arr[i] == search) {
                flag = false;
            }
        }
        
        if(flag){
            System.out.println("Not found: ");
        }else{
            System.out.println("found: ");
        }
    }
}
