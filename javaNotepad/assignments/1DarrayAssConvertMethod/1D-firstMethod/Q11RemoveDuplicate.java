// ===11. Remove the duplicate element

import java.util.Scanner;

class Remove{
    int arr[];

    //input array element:
    public void input(Scanner sc){
        System.out.println("Enter size of array: ");
        int size = sc.nextInt();
        int arr[] = new int [size];
        this.arr = arr;
        System.out.println("Enter "+size +" element: ");
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
    }

    // print array element: 
    public void output(){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }

    //remove duplicate element: 
    public void duplicateElement(){
        
    }
}
class Q11RemoveDuplicate{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Remove obj = new Remove();
        obj.input(sc);

    }
}