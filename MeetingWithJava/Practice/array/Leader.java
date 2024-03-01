import java.util.Scanner;

public class Leader {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a size of array: ");
        int size = sc.nextInt();

        int arr[] = new int[size];

        System.out.println("Enter "+size +" element: ");
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }

        int currentLeader = arr[size-1];
        
        System.out.println("Current leader "+currentLeader);
        for(int i = (size-2); i >= 0; i--){
            if(arr[i] > currentLeader){
                currentLeader = arr[i];
                System.out.println("Current leader "+ currentLeader);
            }
        }
    }
}
