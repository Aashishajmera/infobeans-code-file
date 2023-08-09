// ===11. Remove the duplicate element

import java.util.Scanner;

class Remove {
    public void removeElement(int arr[]){
        int i,j;
        for( i = 0; i < arr.length; i++){
            for( j = 0; j < arr.length; j++){
                if(arr[i] == arr[j]){
                    break;
                }
            }
            if(i == j){
                System.out.print(arr[i]+" ");
            }
        }
    }
}

class Q11RemoveDuplicate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array:  ");
        int size = sc.nextInt();

        int arr[] = new int[size];

        // input array element: 
        System.out.println("Enter "+size+" element: ");
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }

        // print array element: 
        System.out.println("Default array: ");
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();

        // create object
        Remove obj = new Remove();
        obj.removeElement(arr);
    }
}