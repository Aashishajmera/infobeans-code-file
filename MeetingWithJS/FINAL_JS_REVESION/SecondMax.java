import java.util.Scanner;

public class SecondMax{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = {3,4,5,6,7,8,9,3,2,5};
        int max = -2147483648, sMax = -2147483648; // In js use -Infinity and Infinity

        for(int i = 0; i < arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
                sMax = max;
            }else if(arr[i] < max && arr[i] > sMax){
                sMax = arr[i];
            }
        }

        System.out.println(sMax);
    }
}