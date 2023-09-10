
import java.util.Scanner;

public class DeleteEle {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int size = sc.nextInt();

        int arr[] = new int[size];
        int temp = size;
        int arr2[] = new int[temp];

        for (byte i = 0; i < arr.length; i++) {
            arr[i] = sc.nextByte();
        }

        System.out.println("Enter delete element: ");
        int ele = sc.nextInt();

        for (int i = 0; i < size; i++) {
          if(arr[i] == ele){
              if(arr[i] != arr[size-1]){
                  arr2[i] = arr[i+1];
                  temp--;
              }else{
                  temp--;
              }
          }else{
              arr2[i] = arr[i];
          }
        }
        System.out.println(size);
        if (temp == size) {
            System.out.println("Element not found: ");
        }

        for(int i= 0; i < temp; i++){
            System.out.print(arr2[i]+" ");
        }
        // object of sortArrr
//        SortArr obj = new SortArr();
//        obj.printArrElement(arr2);
    }
}
