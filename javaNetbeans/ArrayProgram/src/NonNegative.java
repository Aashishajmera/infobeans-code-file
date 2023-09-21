
import java.util.Scanner;

public class NonNegative {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int size = sc.nextInt();

        int arr[] = new int[size];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr.length -1 - i; j++){
                if(arr[j] > arr[j+1]){
                    arr[j] = arr[j]+arr[j+1];
                    arr[j+1] = arr[j] - arr[j+1];
                    arr[j] = arr[j] - arr[j+1];
                }
            }
        }
        
        System.out.println("Sort array is: ");
        for(int item: arr){
            System.out.print(item+" ");
        }
        
        System.out.println("Enter sum ");
        int target = sc.nextInt();

        boolean flag = false;
        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = i; j < arr.length; j++) {
                sum += arr[j];
                if (target == sum) {
                    flag = true;
                    System.out.println("position start: " + (i + 1) + " to " + (j+1));
                    break;
                }
            }
            if (flag) {
                break;
            }
        }
        if(flag == false){
            System.out.println("wrong given array: ");
        }
    }
}
