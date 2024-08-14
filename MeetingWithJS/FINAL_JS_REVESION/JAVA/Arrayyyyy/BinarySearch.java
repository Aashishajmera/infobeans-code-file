// package FINAL_JS_REVESION.JAVA.Arrayyyyy;
import java.util.Scanner;

public class BinarySearch {
    
    public static int[] sortElement(int arr[]){
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr.length-1; j++){
                if(arr[j] > arr[j+1]){
                    arr[j] = arr[j]+arr[j+1];
                    arr[j+1] = arr[j]-arr[j+1];
                    arr[j] = arr[j]-arr[j+1];
                }
            }
        }
        return arr;
    }
    
    public static int searchElement(int arr[],int n){
        int low = 0;
        int high = arr.length - 1;
        
        while(low <= high){
            int middle = (low + high) / 2;
            if(arr[middle] == n){
                return middle;
            } else if(arr[middle] < n){
                low = middle + 1;
            } else {
                high = middle - 1;
            }
        }
        return -1;
       
    }
    
    public static void main(String... args){
        int arr[] = {1,2,3,2,1,4,6,7,8};
        
        int sortArr[] = sortElement(arr);
        
        for(int i : sortArr){
            System.out.print(i +" ");
        }
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int index = searchElement(sortArr, n);
        
        if(index != -1){
            System.out.println("Element is present: "+index);
        }else{
            System.out.println("Element is not present:");
        }
        
    }
}
