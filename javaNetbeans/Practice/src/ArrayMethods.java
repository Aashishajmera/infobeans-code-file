
import java.util.Arrays;
import java.lang.reflect.Array;
import static java.util.Arrays.compare;

public class ArrayMethods {

    public static void main(String[] args) {
//        int arr[] = new int[3];
//        int arr2[] = new int[22];
//        compare(arr,arr2);

        int Arr[] = {10, 30, 35, 52, 75};
        Arrays.sort(Arr);
        int ele = 10;
        System.out.println(ele
                + " is found at index = "
                + Arrays.binarySearch(Arr, 0, 5, ele));
        
        
    }
    
    
}
