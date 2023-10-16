package ReturnRevisionArrrr;

import java.util.Scanner;
import javax.lang.model.element.Element;

public class InsertElement {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int arr[] = new int[100];

        System.out.println("Enter size of array: ");
        byte size = sc.nextByte();

        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter index: ");
        int index = sc.nextInt();
        if (index < size) {
            System.out.println("Enter element");
            int element = sc.nextInt();
            for (int i = size - 1; i >= index; i--) {
                arr[i + 1] = arr[i];
                if (i == index) {
                    arr[i] = element;
//                    size++;
                    break;
                }
            }
        } else {
            System.out.println("index out of bound: ");
        }
        
        
        for(int i = 0; i <= size; i++){
            System.out.print(arr[i]+" ");
        }

    }
}
