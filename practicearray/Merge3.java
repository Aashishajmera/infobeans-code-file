// 7. Merge two array

import java.util.Scanner;
class Merge{
    int size, size2;
    int arr1[] = new int[size];
    int arr2[] = new int[size2];
    int arr3[] = new int[size+size2];

    // create method 
    public void input(Scanner sc ){
        // first array 
        System.out.println("Enter size of array ");
        int size = sc.nextInt();
        int arr1[] = new int[size];
        System.out.println("Enter " +size +" element: ");
        for(int i = 0; i < arr1.length; i++){
            arr1[i] = sc.nextInt();
        }

        // second array: 
        System.out.println("Enter size of array : ");
        int size2 = sc.nextInt();
        int arr2[] = new int[size2];
        System.out.println("Enter " +size2 +" element: ");
        for(int i = 0; i < arr2.length; i++){
            arr2[i] = sc.nextInt();
        }

        int arr3[] = new int[size+size2];
        this.arr1 = arr1;
        this.arr2 = arr2;
        this.arr3 = arr3;
        this.size = size;
        this.size2 = size2;

    }

    // print array 
    public void output(){
        System.out.println("first array element is: ");
        for(int i = 0; i < arr1.length; i++){
            System.out.print(arr1[i]+" ");
        }
        System.out.println();

        System.out.println("second array element is: ");
        for(int i = 0; i < arr2.length; i++){
            System.out.print(arr2[i]+" ");
        }
        System.out.println();

        System.out.println("third merge array element is: ");
        int k = 0;
        for(int i = 0; i < arr3.length; i++){
            if(i < size){
                arr3[i] = arr1[i];
            }else{
                arr3[i] = arr2[k];
                k++;
            }
        }

        // output array element is: 
        for(int i = 0; i < arr3.length; i++){
            System.out.print(arr3[i]+" ");
        }
    }

}
class Merge3{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Merge obj = new Merge();
        obj.input(sc);
        obj.output();
    }
}