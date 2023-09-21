
import java.util.Scanner;


public class ReverseArrrr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[5];
        System.out.println("Enter 5 element: ");
        
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
        
        for(int j = arr.length-1; j >= 0;  j--){
            System.out.print(" "+arr[j]);
        }
    }
}
