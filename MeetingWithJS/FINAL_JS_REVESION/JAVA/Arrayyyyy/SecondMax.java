package FINAL_JS_REVESION.JAVA.Arrayyyyy;

public class SecondMax {
    public static void main(String... args){
        int max = -2147483648, sMax = -2147483648;
        int arr[] = {1,2,3,4,5,6,7,3};
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > max){
                sMax = max;
                max = arr[i];
            }else if(arr[i] > sMax && arr[i] != max){
                sMax = arr[i];
            }
        }
        System.out.println(sMax);
    }
}
