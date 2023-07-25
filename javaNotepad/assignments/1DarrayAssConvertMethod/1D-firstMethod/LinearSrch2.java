// 3. Search in element in array (linear and binary)
import java.util.Scanner;

class linear {
    public int m1(int arr[], Scanner sc) {
		int count = 0;
		System.out.println("Enter search element : ");
		int search = sc.nextInt();
        for (int i = 0; i < arr.length; i++) {
           if(search == arr[i]){
			   count++;
		   }
        }
        return count;
    }
}

public class LinearSrch2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int size = sc.nextInt();

        int arr[] = new int[size];
        System.out.println("Enter " + size + " element: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        // create object:
        linear obj = new linear();
       int result = obj.m1(arr, sc);
	   if(result == 0){
		   System.out.println("Not found: ");
	   }else{
		   System.out.println("Element found and "+result+" time repeat: ");
	   }
       

    }
}