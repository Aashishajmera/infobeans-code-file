
import java.util.Scanner;

public class InsertArr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int size = sc.nextInt();
        
        int arr[] = new int[size];
        System.out.println("Enter "+size +" element: ");
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
        
        System.out.println("enter index: ");
        int index = sc.nextInt();
        System.out.println("Enter index value: ");
        int value = sc.nextInt();
        
        for(int i = 0; i < arr.length; i++){
            if(i == index){
                arr[i] = value;
            }
        }
        
        for(byte i = 0; i < arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        
//        for(byte x: arr){
//            System.out.print(x+" ");
//        }
    }
}
