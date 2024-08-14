package FINAL_JS_REVESION.JAVA.Arrayyyyy;

public class Sort {
    public static void main(String[] args) {
        int arr[] = {3,2,4,1,5,22,9};
        
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr.length - i -1; j++){
                if(arr[j] > arr[j+1]){
                    arr[j] = arr[j] + arr[j+1];
                    arr[j+1] = arr[j] - arr[j+1];
                    arr[j] = arr[j] - arr[j+1];
                }
            }
        }
        
        for(int i: arr){
            System.out.println(i);
        }
    }
}