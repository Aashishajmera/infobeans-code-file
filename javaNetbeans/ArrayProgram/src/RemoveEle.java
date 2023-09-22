
import java.util.Scanner;

public class RemoveEle {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int size = sc.nextInt();

        int arr[] = new int[size];
        int arr1[] = new int[size];
        int n = size;
        int k = 0;
        System.out.println("Enter "+size +" element: ");
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
        
        System.out.println("enter index: ");
        int index = sc.nextInt();
        
        
        for(int i = 0; i < arr.length; i++){
            if(i == index){
                n--;
            }else{
                arr1[k] = arr[i];
                k++;
            }
        }
        
        for(int i = 0; i < n; i++){
            System.out.print(arr1[i]+" ");
        }
    }
}
